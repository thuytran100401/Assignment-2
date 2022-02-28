/**
 * Assingment 2
 *  Business Class:
 *      This class should implement main() method. 
 *      In the body of the main() method you should create at least 
 *          2 instances of each of the leaf classes: executive,full time salaried employee, 
 *          full time hourly employee, part time hourly employee, hourly paid contractor, and customer. 
 *      It is up to you to choose which values of the attributes for each of 
 *          the instances to use. For each instance, make a call to introduce()
 *          method and make a call to computePay() method for business associates 
 *          and makePayment() for customers.
 * 
 * Thuy Tran, February 27, 2022
 */

public class BusinessTest {
	private static boolean displaySSN = false;
	public static void main(String[] args) {
		
		int numHrs = 40, numWeeks = 2;
		  
        // create new addresses
		Address address1 = new Address(1122,"Rotherhaven way", "San Jose", "95111", "CA");
		Address address2 = new Address(2233,"Enesco Ave", "San Jose", "95121", "CA");
		Address address3 = new Address(3344,"Hellyer Ave", "San Jose", "95111", "CA");
		Address address4 = new Address(4455,"Ruby rd", "San Jose", "95148", "CA");
		Address address5 = new Address(5566,"Angeloni Ave", "San Jose", "95111", "CA");
		Address address6 = new Address(1004,"Tully rd", "San Jose", "95121", "CA");
		  
		// create new executive
		Executive executive = new Executive("Thuy", "Tran", address1, 100401,
        250000.00, 15000.00, "1245-564-1356"); executive.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", executive.computePay());
		System.out.println("\n\n------------------------------------\n");
		  
		// create new FullTimeSalaried
		FullTimeSalaried fullSalaried = new FullTimeSalaried("Lalisa", "Manoban",
		address2, 112233, 150000.00, "2365-489-6561"); fullSalaried.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", fullSalaried.computePay(numWeeks));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new FullTimeHourly
		FullTimeHourly fullHourly = new FullTimeHourly("Mina", "Nguyen",
		address3, 223344, 100000.00, 10500.00, "8945-789-5413"); fullHourly.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", fullHourly.computePay(numHrs));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new PartTimeHourly
		PartTimeHourly partTime = new PartTimeHourly("Jennie", "Kim",
		address4, 012645, 30.00, "4568-465-4981"); partTime.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", partTime.computePay(numHrs));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new Contractor
		Contractor contractor = new Contractor("Rose", "Park",
		address5, 020406, 50.00, "5463-185-8736"); contractor.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", contractor.computePay(numHrs));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new customer
		Customer customer = new Customer("Jisoo", "Kim", address6,
		146132, "4564-465-4651"); customer.setPayPreference("Visa card"); customer.introduce();
		customer.makePayment();
		 
	}
}