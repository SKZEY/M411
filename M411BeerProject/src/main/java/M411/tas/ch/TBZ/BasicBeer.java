package M411.tas.ch.TBZ;

import com.google.gson.annotations.SerializedName;

/*
 *  @author melvin 
 * */
/**
 * The Class BasicBeer.
 */
public class BasicBeer {
	
	/** The id. */
	@SerializedName("id")
	String id;
	
	/** The name. */
	@SerializedName("name")
	String name;
	
	/** The description. */
	@SerializedName("description")
	String description;

	/**
	 * Instantiates a new basic beer.
	 *
	 * @param id the id
	 * @param name the name
	 * @param description the description
	 */
	public BasicBeer(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	// Setter
	public void setID(String id) {
		this.id = id;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	// Getter
	public String getID() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id + ";" + name + ";" + description;
	}

}
