package M411.tas.ch.TBZ;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
 *  @author melvin 
 * */
/**
 * The Class Result.
 */
public class Result {
	
	/** The data. */
	@SerializedName("data")
	@Expose
	List<SpecialBeer> data = new ArrayList<SpecialBeer>();

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public List<SpecialBeer> getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param listofBeer the new data
	 */
	public void setData(List<SpecialBeer> listofBeer) {
		this.data = listofBeer;
	}
}
