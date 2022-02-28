/**
 * Assingment 2
 *  FullTimeSalaried Class:
 *      For a full time salaried employee, computePay() method will accept 
 *          the number of weeks as an input argument.
 *      For a full time salaried employee, the pay is based on their yearly 
 *          compensation adjusted to the number of weeks specified by the 
 *          input argument.
 * 
 * Thuy Tran, February 27, 2022
 */

public class FullTimeSalaried extends FullTimeEmployee {

	/**
	 * Default Constructor of FullTimeSalaried class
	 */
	public FullTimeSalaried() {
		super();
	}

	/**
	 * Constructor of FullTimeSalaried class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id		Employee ID
	 * @param salary 	base pay for full time salaried employee
	 * @param ssn		social security number of a person
	 */
	public FullTimeSalaried(String firstName, String lastName, Address address, int id, double salary, String ssn) {
		super(firstName, lastName, address, id, salary, ssn);
	}

	/**
	 * Convert a FullTimeSalaried into a string
	 * in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 * Base Pay: $<basePay>/yr
	 */
	@Override public String toString() {
		return super.toString();
	}

	/**
	 * Print out the full time salaried employee information
	 * without showing the SSN
	 * @param displaySSN do the SSN display
	 */
	public void introduce(boolean displaySSN) {
		if(displaySSN == true) {
			System.out.println("We can not display the SSN.");
		}
		System.out.println(toString());
	}

	/**
	 * This method will calculate the salary of the full time employee.
	 * The pay is based on their yearly compensation adjusted to the number of weeks specified
	 *  by the input argument.
	 * @param numWeeks week that had worked
	 * @return paid for the week had worked
	 */
	public double computePay(int numWeeks) {
		return (getBasePay()/52) * numWeeks;
	}
}