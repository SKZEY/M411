package M411.tas.ch.TBZ;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Json {

	String url;
	String key;
	int styleId;
	Gson gson = new Gson();

	/**
	 * Konstruktor für drei Parameter (inkl. styleId)
	 * @param url Der erste Teil der API-URL
	 * @param key Schlüssel für die API
	 * @param styleId Styleangaben
	 */
	public Json(String url, String key, int styleId) {
		this.url = url;
		this.key = key;
		this.styleId = styleId;
	}

	/**
	 * Konstruktor für zwei Parameter (ohne styleId)
	 * @param url Der erste Teil der API-URL
	 * @param key Schlüssel für die API
	 */
	public Json(String url, String key) {
		this.url = url;
		this.key = key;
	}

	/**
	 * Setzt die API-URL zusammen
	 * @return URL für die API
	 */
	private String getAPI() {
		String api;
		api = url + "key=" + key;
		if (styleId != 0) {
			api = api + "&styleId=" + styleId;
		}
		return api;
	}

	/**
	 * sendet eine Anfrage an die API und gibt (im Erfolgsfall) ein JSON-Dokument zurück 
	 * @return JSON-Dokument (parse tree)
	 * @throws IOException
	 */
	private JsonElement callJson() throws IOException {
		URL url = null;
		JsonElement root = null;
		try {
			url = new URL(getAPI());
			URLConnection request = url.openConnection();
			request.connect();
			JsonParser jp = new JsonParser();
			root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return root;
	}

	/**
	 * wandelt ein JSON-Dokument in ein Objekt der Klasse Result um
	 * @param cl Klasse
	 * @return Result-Objekt
	 * @throws JsonSyntaxException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object createJavaObjectFromJson(Class<Result> cl) throws JsonSyntaxException, IOException, ClassNotFoundException {
		Object result = gson.fromJson(callJson(), cl);
		return result;
	}

}
