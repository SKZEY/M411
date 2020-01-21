package M411.tas.ch.TBZ;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.JsonSyntaxException;

// TODO: Auto-generated Javadoc
/**
 * The Interface BeerAdminInterface.
 *
 * @author melvin
 */

public interface BeerAdminInterface {


	/** The beer map. */
	public HashMap<String, String> beerMap = new HashMap<String, String>();
	
	/** The Special beer map. */
	public HashMap<String, SpecialBeer> SpecialBeerMap = new HashMap<String, SpecialBeer>();


	/**
	 * Load beer styles.
	 *
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void loadBeerStyles() throws JsonSyntaxException, ClassNotFoundException, IOException;
	
	/**
	 * Prints the beer styles.
	 *
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void printBeerStyles() throws JsonSyntaxException, ClassNotFoundException, IOException;
	
	/**
	 * Prints the beer styles.
	 *
	 * @param search the search
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void printBeerStyles(String search) throws JsonSyntaxException, ClassNotFoundException, IOException;
	
	/**
	 * Gets the beer list for style.
	 *
	 * @param idStyle the id style
	 * @return the beer list for style
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void getBeerListForStyle(int idStyle) throws JsonSyntaxException, ClassNotFoundException, IOException;
	
	/**
	 * Prints the beer list.
	 *
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void printBeerList() throws JsonSyntaxException, ClassNotFoundException, IOException;
	
	/**
	 * Prints the beer.
	 *
	 * @param id the id
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void printBeer(String id) throws JsonSyntaxException, ClassNotFoundException, IOException;

}
