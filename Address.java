/**
 * Assingment 2
 *  Address Class:
 *      a separate class with individualfields defined for street number,
 *          street name, city name, zip code, and state.
 *      For this exercise, we will assume that no person has an apartment
 *          number or a second address line. 
 * Thuy Tran, February 27, 2022
 */

public class Address {
    // variables
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;

	/**
	 * Constructor for the Address class
	 * 
	 * @param streetNum the street number
	 * @param streetName the name of the street
	 * @param city the name of city
	 * @param zip the zip code of the address
	 * @param state the name of state
	 */
	public Address(int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}

	/**
	 * Returns the street number portion of the address
	 * @return the street number
	 */
	public int getStreetNum() {
		return streetNum;
	}

	/**
	 * Returns the name portion of the address
	 * @return the name of the street
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Return the city of the address
	 * @return the city of the address
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Return the zip code of the address
	 * @return the zip of the address
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Return the name of the state of the address
	 * @return the state of the address
	 */
	public String getState() {
		return state;
	}

	/**
	 * Setter for a number to the address
	 * @param streetNum the number of address
	 */
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	/**
	 * Setter for a street to the address 
	 * @param streetName the street of address
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Setter for a city name to the address
	 * @param city the name of city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Setter for a zip code to the address
	 * @param zip the zip code of the address
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Setter for the state to the address
	 * @param state the name of state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Displays an address in the format streetNum + " " + streetName +", "+ city+", "+ zip+", "+state;
	 * 
	 * @return a String containing the address
	 */
	@Override 
    public String toString() {
		return streetNum + " " + streetName+", "+ city+", "+ zip+", "+state;
	}
}