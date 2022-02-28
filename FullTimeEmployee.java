/**
 * Assingment 2
 *  FullTimeEmployee Class:
 *      A class for the full time employee
 * 
 * Thuy Tran, February 27, 2022
 */


abstract class FullTimeEmployee extends Employee {
    
    // Variable
	private double basePay;

	/**
	 * Default Constructor of FullTimeEmployee class
	 */
	public FullTimeEmployee() {
		super();
		basePay = 0.0;
	}

	/**
	 * Constructor of FullTimeEmployee class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id	    Employee ID
	 * @param basePay   base pay for full time employee
     * @param ssn	    social security number of a person
	 */
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.basePay = basePay;
	}

	/**
	 * Return the base pay for full time employee
	 * @return base pay for full time employee
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * Assign the base pay to a full time employee
	 * @param basePay base pay for full time employee
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	/**
	 * Convert a FullTimeEmployee into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 * Base Pay: $<basePay>/yr
	 */
	@Override public String toString() {
		return super.toString()+
				"\nBase Pay: $"+basePay+"/yr";
	}
}