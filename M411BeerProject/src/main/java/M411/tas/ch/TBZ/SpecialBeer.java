package M411.tas.ch.TBZ;

import com.google.gson.annotations.SerializedName;

/*
 *  @author melvin 
 * */
/**
 * The Class SpecialBeer.
 */
public class SpecialBeer extends BasicBeer {
	
	/** The style id. */
	@SerializedName("styleId")
	String styleId;

	/**
	 * Instantiates a new special beer.
	 *
	 * @param id the id
	 * @param name the name
	 * @param description the description
	 * @param idStyle the id style
	 */
	public SpecialBeer(String id, String name, String description, String idStyle) {
		super(id, name, description);
		this.styleId = idStyle;
	}

	/**
	 * Sets the id style.
	 *
	 * @param idStyle the new id style
	 */
	public void setIdStyle(String idStyle) {
		this.styleId = idStyle;
	}

	/**
	 * Gets the id style.
	 *
	 * @return the id style
	 */
	public String getIdStyle() {
		return styleId;
	}

	/* (non-Javadoc)
	 * @see M411.tas.ch.TBZ.BasicBeer#toString()
	 */
	@Override
	public String toString() {
		return id + ";" + name + ";" + description + ";" + styleId;
	}

}
