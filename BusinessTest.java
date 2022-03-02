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
		Address address11 = new Address(710,"Mckee Rd", "San Jose", "95125", "CA");
		Address address2 = new Address(2233,"Enesco Ave", "San Jose", "95121", "CA");
		Address address22 = new Address(5874,"Capitol Exp", "San Jose", "95121", "CA");
		Address address3 = new Address(3344,"Hellyer Ave", "San Jose", "95111", "CA");
		Address address33 = new Address(4561,"Silver Creek Ave", "San Jose", "95121", "CA");
		Address address4 = new Address(4455,"Ruby Rd", "San Jose", "95148", "CA");
		Address address44 = new Address(897,"Brahamn Ave", "San Jose", "95111", "CA");
		Address address5 = new Address(5566,"Angeloni Ave", "San Jose", "95111", "CA");
		Address address55 = new Address(5201,"White Rd", "San Jose", "95148", "CA");
		Address address6 = new Address(1004,"Tully Rd", "San Jose", "95121", "CA");
		Address address66 = new Address(1111,"Story Rd", "San Jose", "95122", "CA");
		  
		// create new executive and display their information
		System.out.println("Executive");
		Executive executive = new Executive("Thuy", "Tran", address1, 100401,
        250000.00, 15000.00, "1245-564-1356"); executive.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", executive.computePay());
	
		System.out.println("\n");
		Executive executive1 = new Executive("Benjamin", "Tran", address11, 114488,
        100000.00, 25000.00, "4564-456-1234"); executive1.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", executive1.computePay());
		System.out.println("\n\n------------------------------------\n");

		// create new FullTimeSalaried and display their information
		System.out.println("Full Time Salaried Employee");
		FullTimeSalaried fullSalaried = new FullTimeSalaried("Lalisa", "Manoban",
		address2, 112233, 150000.00, "2365-489-6561"); fullSalaried.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", fullSalaried.computePay(numWeeks));

		System.out.println("\n");
		FullTimeSalaried fullSalaried1 = new FullTimeSalaried("Nhi", "Pham",
		address22, 256146, 250000.00, "1654-165-1641"); fullSalaried1.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", fullSalaried1.computePay(numWeeks));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new FullTimeHourly and display their information
		System.out.println("Full Time Hourly Employee");
		FullTimeHourly fullHourly = new FullTimeHourly("Mina", "Nguyen",
		address3, 223344, 100000.00, 10500.00, "8945-789-5413"); fullHourly.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", fullHourly.computePay(numHrs));

		System.out.println("\n");
		FullTimeHourly fullHourly1 = new FullTimeHourly("Hana", "Nguyen",
		address33, 645134, 120000.00, 55200.00, "4571-187-1497"); fullHourly1.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", fullHourly1.computePay(numHrs));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new PartTimeHourly and display their information
		System.out.println("Part Time Hourly Employee");
		PartTimeHourly partTime = new PartTimeHourly("Jennie", "Kim",
		address4, 012645, 30.00, "4568-465-4981"); partTime.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", partTime.computePay(numHrs));

		System.out.println("\n");
		PartTimeHourly partTime1 = new PartTimeHourly("Johnny", "Pham",
		address44, 512142, 25.00, "4264-142-2489"); partTime1.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", partTime1.computePay(numHrs));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new Contractor and display their information
		System.out.println("Hourly Paid Contractor");
		Contractor contractor = new Contractor("Rose", "Park",
		address5, 020406, 50.00, "5463-185-8736"); contractor.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", contractor.computePay(numHrs));

		System.out.println("\n");
		Contractor contractor1 = new Contractor("Vanni", "Park",
		address55, 541372, 40.00, "4574-134-2485"); contractor1.introduce(displaySSN);
		System.out.printf("Paid: $%.2f", contractor1.computePay(numHrs));
		System.out.println("\n\n------------------------------------\n");
		  
		// create new customer and display their information
		System.out.println("Customer");
		Customer customer = new Customer("Jisoo", "Kim", address6,
		146132, "4564-465-4651"); customer.setPayPreference("Master Card"); customer.introduce();
		customer.makePayment();

		System.out.println();
		Customer customer1 = new Customer("Namiesc", "Ma", address66,
		541278, "4564-147-1245"); customer1.setPayPreference("Visa Card"); customer1.introduce();
		customer1.makePayment();
		 
	}
}