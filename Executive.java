/**
 * Assingment 2
 *  Executive Class:
 *      For an executive, the pay is simply their yearly compensation 
 *          plus the yearly bonus.
 * 
 * Thuy Tran, February 27, 2022
 */

public class Executive extends Employee{

    // Variables
	private double yearlyBonus;
    private double yearlyCompensation;

	/**
	 * Default Constructor of Executive class
	 */
	public Executive() {
		super();
		yearlyBonus = 0.0;
		yearlyCompensation = 0.0;
	}

	/**
	 * Constructor of Executive class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id	    Employee ID
	 * @param pay	    yearly pay to executive
	 * @param bonus	    yearly bonus for executive
     * @param ssn	    social security number of a person
	 */
	public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus, String ssn) {
		super(firstName, lastName, address, id, ssn);
		this.yearlyBonus = bonus;
		this.yearlyCompensation = pay;
	}

	/**
	 * Get the yearly bonus of an executive
	 * @return yearly bonus
	 */
	public double getBonus() {
		return yearlyBonus;
	}

	/**
	 * Setter for the yearly bonus to an executive
	 * @param bonus yearly bonus
	 */
	public void setBonus(double bonus) {
		this.yearlyBonus = bonus;
	}

	/**
	 * Get the paid to an executive
	 * @return yearly pay
	 */
	public double getCompensation() {
		return yearlyCompensation;
	}

	/**
	 * Setter for the yearly pay to an executive
	 * @param pay yearly pay
	 */
	public void setCompensation(double pay) {
		this.yearlyCompensation = pay;
	}

	/**
	 * Convert a employee into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 * Bonus: $<yearlyBonus>/yr
	 * Compensation: $<yearlyCompensation>/yr
	 */
	@Override public String toString() {
		return super.toString()+
				"\nBonus: $"+yearlyBonus+"/yr"+
				"\nCompensation: $"+yearlyCompensation+"/yr";
	}

	/**
	 * Displays the Executive information without showing the SSN
	 * @param displaySSN do the SSN display
	 */
	
	public void introduce(boolean displaySSN) {
		if(displaySSN == true) {
			System.out.println("We can not display the SSN.");
		}
		System.out.println(toString());
	}

    /**
     * the pay is simply their yearly compensation plus the yearly bonus
     * @return the compensation plus the yearly bonus
     */
	public double computePay() {
		return yearlyCompensation+yearlyBonus;
	}
	
}