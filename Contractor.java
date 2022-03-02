/**
 * Assingment 2
 *  Contractor Class:
 *       For an hourly paid contractor, the pay is calculated by simply 
 *           multiplying the number of hours they worked by the base pay. 
 * 
 * Thuy Tran, February 27, 2022
 */

public class Contractor extends Employee {

    // Variables
	private double basePay;

	/**
	 * Default Constructor of Contractor class
	 */
	public Contractor() {
		super();
		basePay = 0.0;
	}

	/**
	 * Constructor of Contractor class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id	    Employee ID
	 * @param basePay   base pay for contractor
     * @param ssn	    social security number of a person
	 */
	public Contractor(String firstName, String lastName, Address address, int id, double basePay, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.basePay = basePay;
	}

	/**
	 * Return the base pay for contractor
	 * @return base pay for contractor
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * Setter for the base pay to a contractor
	 * @param basePay base pay for contractor
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	/**
	 * Convert a Contractor into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 * Base Pay: $<basePay>/hr
	 */
	@Override 
    public String toString() {
		return super.toString() +
				"\nBase Pay: $" + basePay + "/hr";
	}

	/**
	 * Displays the information of the contractor without showing the SSN
	 * @param displaySSN do not display the SSN
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN == true) {
			System.out.println("We can not display the SSN.");
		}
		System.out.println(toString());
	}

	/**
	 * Method to return the pay to the contractor by simply multiplying the 
     *  number of hours they worked by the base pay.
     * This method will accept the number of hours as an input argument  
	 * @param numHrs the hour the employee worked
	 * @return the paid with hourly
	 */
	public double computePay(int numHrs) {
		return basePay * numHrs;
	}
}