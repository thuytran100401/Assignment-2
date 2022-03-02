/**
 * Assingment 2
 *  FullTimeHourly Class:
 *      For a full time hourly employee, the pay is based on the hourly pay 
 *          and the number of hours specified by the input argument. 
 *       Make sure to account for possible overtime.  
 * 
 * Thuy Tran, February 27, 2022
 */

public class FullTimeHourly extends FullTimeEmployee{

    // Variable
	private double overtimePay;

	/**
	 * Default Constructor of FullTimeHourly class
	 */
	public FullTimeHourly() {
		super();
		overtimePay = 0.0;
	}

	/**
	 * Constructor of FullTimeHourly class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id	    Employee ID
	 * @param basePay   base pay for full time Hourly employee
	 * @param overtime  the overtime pay for working overtime
     * @param ssn	    social security number of a person
	 */
	public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime, String ssn) {
		super(firstName, lastName, address, id, basePay, ssn);
		this.overtimePay = overtime;
	}
    
	/**
	 * Return the pay for overtime
	 * @return the overtime pay for working overtime
	 */
	public double getOvertimePay() {
		return overtimePay;
	}

	/**
	 * Setter for the amount of overtime pay to full time Hourly
	 * @param overtime the overtime pay for working overtime
	 */
	public void setOvertimePay(double overtime) {
		this.overtimePay = overtime;
	}

	/**
	 * Convert a FullTimeHourly into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 * Base Pay: $<basePay>/yr
	 * Overtime Pay: $<overtimePay>
	 */
	@Override public String toString() {
		return super.toString()+
				"\nOvertime Pay: $" + overtimePay;
	}

	/**
	 * Displays the full time Hourly employee information without showing the SSN
	 * @param displaySSN do the SSN display
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN == true) {
			System.out.println("We can not display the SSN.");
		}
		System.out.println(toString());
	}

	/**
	 * calculate the paid of full time Hourly employee based on the hourly pay
     *  and the number of hours specified by the input argument
	 * @param numHrs hours that had worked
	 * @return paid for the hours had worked
	 */
	public double computePay(int numHrs) {
		return ((getBasePay()/8760)*numHrs) + overtimePay;
	}
}