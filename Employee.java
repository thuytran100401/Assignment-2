/**
 * Assingment 2
 *  Employee Class:
 * 		 executive, full time salaried employee,full time hourly employee,
 * 			 part time hourly employee, hourly paid contractor,
 * 
 * Thuy Tran, February 27, 2022
 */

abstract class Employee extends Person{
	// Variables
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	/**
	 * Default Constructor of Employee class
	 */
	public Employee() {
		super();
		id = 0;
	}

	/**
	 * Constructor of Employee class
	 * @param firstName first name of a person
	 * @param lastName	last name of a person
	 * @param address	home address of a person
	 * @param id		Employee ID
	 * @param ssn		social security number of a person
	 */
	public Employee(String firstName, String lastName, Address address, int id, String ssn) {
		super(firstName, lastName, address, ssn);
		this.id = id;
	}

	/**
	 * Return the Employee ID
	 * @return Employee ID
	 */
	public int getID() {
		return id;
	}

	/**
	 * Return the education level of a employee
	 * @return education level
	 */
	public String getEducation() {
		return educationLevel;
	}

	/**
	 * Return if the employee use direct deposit or not
	 * @return direct deposit
	 */
	public boolean getDirectDeposit() {
		return directDeposit;
	}

	/**
	 * Setter for an ID to an employee
	 * @param id Employee ID
	 */
	public void setID(int id) {
		this.id = id;
	}

	/**
	 * Setter for the education level to an employee
	 * @param educationLevel education level of employee
	 */
	public void setEducation(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	/**
	 * Setter for do an employee use direct deposit or not
	 * @param directDeposit direct deposit 
	 */
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	/**
	 * Convert a employee into a string in the format:
	 * Name: <firstName> <lastName>
	 * Address: <address>
	 * Employee ID: <id>
	 */
	@Override
	public String toString() {
		return super.toString()+
				"\nEmployee ID: "+id;
	}
}