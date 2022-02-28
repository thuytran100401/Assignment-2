/**
 * Assingment 2
 *  PartTimeHourly Class:
 *      For a part time hourly employee, the pay is based on the hourly 
 *          pay and the number of hours specified by the input argument. 
 *      Part time hourly employees are not allowed to work more than 40 hours
 *       a week, so implement a check for the proper number of hours and 
 *          if they exceed 40 hours, return -1.
 * 
 * Thuy Tran, February 27, 2022
 */

public class PartTimeHourly extends Employee {
    
    // Variable
	private double baseHourlyPay;

	/**
	 * Default Constructor of PartTimeHourly class
	 */
	public PartTimeHourly() {
		super();
		baseHourlyPay = 0.0;
	}

	/**
	 * Constructor of PartTimeHourly class
	 * @param firstName     first name of a person
	 * @param lastName	    last name of a person
	 * @param address	    home address of a person
	 * @param id	        Employee ID
	 * @param baseHourlyPay base hourly pay for part time employee
     * @param ssn	        social security number of a person
	 */
	public PartTimeHourly(String firstName, String lastName, Address address, int id, double pay, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.baseHourlyPay = pay;
	}

	/**
	 * Return the base hourly pay for an employee
	 * @return baseHourlyPay
	 */
	public double getHourlyPay() {
		return baseHourlyPay;
	}

	/**
	 * Assign the base hourly pay to an employee
	 * @param baseHourlyPay base hourly pay
	 */
	public void setHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}

	/**
	 * Convert a PartTimeHourly into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 * Hourly Pay: $<baseHourlyPay>/hr
	 */
	@Override public String toString() {
		return super.toString()+
				"\nHourly Pay: $"+baseHourlyPay+"/hr";
	}

	/**
	 * Displays the employee information that get hourly pay without showing the SSN
	 * @param displaySSN do the SSN display
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN == true) {
			System.out.println("We can not display the SSN.");
		}
		System.out.println(toString());
	}

	/**
     * This method will accept the number of hours as an input argument.
	 * The pay is based on the hourly pay and the number of hours 
     *  specified by the input argument.
     * 
	 * @param numHrs the hour had work
	 * @return the paid with hourly
	 */
	public double computePay(int numHrs) {
		if (numHrs > 40) {
			return -1;
		}
		return baseHourlyPay * numHrs;
	}
}