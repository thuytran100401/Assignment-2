/**
 * Assingment 2
 *  Person Class:
 *    accepts first and last name and address as input arguments  
 * 
 * Thuy Tran, February 27, 2022
 */

abstract class Person {
    // Variables
	private String firstName; 
    private String lastName;
	private int age;
	private String ssn;
	private Address address;

	/**
	 * Default Constructor of person class
	 */
	public Person() {
		firstName = "unknown";
		lastName = "unknown";
		ssn = "unknown";
		address = new Address(0,"","","","");
	}

	/**
	 * Constructor of Person class
	 * @param firstName	first name of a person
	 * @param lastName	last mane of a person
     * @param address home address of a person
	 * @param ssn	social security number of a person
	 */
	public Person(String firstName, String lastName, Address address, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
        this.address = address;
		this.ssn = ssn;
	}

	/**
	 * get the person first name
	 * @return first name of a person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * get the person last name
	 * @return last name of a person
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * get an age of a person
	 * @return age of a person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * get social security number of a person
	 * @return social security number of a person
	 */
	public String getSSN() {
		return ssn;
	}

	/**
	 * get home address of a person
	 * @return home address of a person
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Setter for the new person first name
	 * @param firstName first name of a person
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Setter for the new person last name
	 * @param lastName last mane of a person
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Setter for a new age for a person
	 * @param age age of a person
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * set new a social security number for a person
	 * @param ssn social security number of a person
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * set a new home address for a person
	 * @param address home address of a person
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Convert a person into a string
	 * in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 */
	@Override
	public String toString() {
		return "Name: "+ firstName + " " + lastName + 
				"\nAddress: " + address;
	}
}

