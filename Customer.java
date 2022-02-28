/**
 * Assingment 2
 *  Customer Class:
 *      An extended class from Person class which includes payPreference and customerId.
 * 		For objects of Customer type introduce() method should just never display SSN information. 
 * Thuy Tran, February 27, 2022
 */


public class Customer extends Person {
    // Variables
	private String payPreference;
	private int customerID;

	/**
	 * Default Constructor of Customer class
	 */
	public Customer() {
		super();
		customerID = 0;
	}

	/**
	 * Constructor of Customer class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id	    customer ID
     * @param ssn	    social security number of a person
	 */
	public Customer(String firstName, String lastName, Address address, int id, String ssn) {
		super(firstName, lastName, address, ssn);
		this.customerID = id;
	}

	/**
	 * Return the customer pay preference
	 * @return the customer pay preference
	 */
	public String getPayPreference() {
		return payPreference;
	}

	/**
	 * Return the customer ID
	 * @return customer ID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * Assign the pay preference to a customer
	 * @param payPreference customer pay preference
	 */
	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}

	/**
	 * Assign the customer ID to a customer
	 * @param id customer ID
	 */
	public void setID(int id) {
		this.customerID = id;
	}

	/**
	 * Convert a customer into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Customer ID: <customerID>
	 */
	@Override public String toString() {
		return super.toString()+
				"\nCustomer ID: "+customerID;
	}

	// Displays the customer information
	public void introduce() {
	    System.out.println(toString());
	}

	// display the preferred method of payment for the customer 
	public void makePayment() {
		System.out.println("Pay Preference: "+getPayPreference());
	}
	
}
