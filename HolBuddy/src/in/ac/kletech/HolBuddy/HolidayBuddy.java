package in.ac.kletech.HolBuddy;

import java.util.Scanner;

abstract class HolidayBuddy {
	int Noofdays;
	int Noofnights;
	double distance;
	final double costdist1km = 100;
	double packageamt;
	int key;
	double discount;

	abstract double caldiscount();

	abstract boolean count();

	abstract double select();

	Customer c = new Customer("Shweta", 23, "Hubli", 944, "Female");
	Scanner sc = new Scanner(System.in);
}

class TravelOnly extends HolidayBuddy {

	double select() {
		System.out.println("Enter the No.of days");
		Noofdays = sc.nextInt();
		System.out.println("Select the distance b/w source and distance\n");
		distance = sc.nextInt();
		packageamt = costdist1km * distance;
		boolean i = count();
		System.out.println("Package Amt is " + packageamt);
		return packageamt;
	}

	boolean count() {
		if (distance > 1)
			return true;
		else
			return false;
	}

	double caldiscount() {
		if (c.Gender == "Female" && count() == true) {
			discount = 0.12;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);
		} else if (count() == true) {
			discount = 0.10;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);
		} else if (c.Gender == "Female") {
			discount = 0.02;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);

		}

		return 1;

	}

	void status() {
		System.out.println("Customer Name is" + c.sCustomerName);
		System.out.println("Customer TotalPackage Amt is " + packageamt);
		System.out.println("Discount availed is" + discount);

	}

}

class HolidayPackage extends HolidayBuddy {
	double select() {
		System.out.println("Enter the No.of days");
		Noofdays = sc.nextInt();
		System.out.println("Select the distance b/w source and distance\n");
		distance = sc.nextInt();
		packageamt = costdist1km * distance;
		boolean i = count();
		System.out.println("Select the tourist places\n1.Agra\n2.Mumbai\n3.Bangalore\n4.Hubli");
		System.out.println("You have selected");
		key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Agra");
			break;
		case 2:
			System.out.println("Munbai");
			break;
		case 3:
			System.out.println("Bangalore");
			break;
		case 4:
			System.out.println("Hubli");
			break;

		}

		System.out.println("Package Amt is " + packageamt);
		return packageamt;
	}

	boolean count() {
		if (distance > 1)
			return true;
		else
			return false;
	}

	double caldiscount() {
		if (c.Gender == "Female" && count() == true) {
			discount = 0.12;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);
		} else if (count() == true) {
			discount = 0.10;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);
		} else if (c.Gender == "Female") {
			discount = 0.02;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);

		}

		return 1;

	}

	void status() {
		System.out.println("Customer Name is" + c.sCustomerName);
		System.out.println("Customer TotalPackage Amt is " + packageamt);
		System.out.println("Discount availed is" + discount);

	}

}

class BedandBreakfast extends HolidayBuddy {
	double select() {
		System.out.println("Enter the No.of days and nights");
		Noofdays = sc.nextInt();
		Noofnights = sc.nextInt();
		System.out.println("Select the distance b/w source and distance\n");
		distance = sc.nextInt();
		packageamt = costdist1km * distance;
		boolean i = count();
		System.out.println("Enter the no.of beds to be booked\n");
		int bed = sc.nextInt();
		System.out.println("Select the menu for the  Breakfast\n1.Idli\n2.Dosa\n3.upma ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Your menu will be updated");
			break;
		case 2:
			System.out.println("Your menu will be updated");
			break;
		case 3:
			System.out.println("Your menu will be updated");
			break;

		}

		System.out.println("Package Amt is " + packageamt);
		return packageamt;
	}

	boolean count() {
		if (distance > 1)
			return true;
		else
			return false;
	}

	double caldiscount() {
		if (c.Gender == "Female" && count() == true) {
			discount = 0.12;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);
		} else if (count() == true) {
			discount = 0.10;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);
		} else if (c.Gender == "Female") {
			discount = 0.02;
			double totalamt = packageamt - discount;

			System.out.println("Total Amt is " + totalamt);

		}

		return 1;
	}

	void status() {
		System.out.println("Customer Name is" + c.sCustomerName);
		System.out.println("Customer TotalPackage Amt is " + packageamt);
		System.out.println("Discount availed is" + discount);

	}

}
