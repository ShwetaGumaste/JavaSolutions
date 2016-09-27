package in.ac.kletech.HolBuddy;

import java.util.Scanner;

public class Tdemo {

	public static void main(String[] args) {
		while (true) {
			int choice;
			System.out.println("Select the type of package\n1.TravelOnly\n2.HolidayPackage\n3.BedandBreakfast\n");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("TravelOnly Package is selected\n");
				TravelOnly t = new TravelOnly();
				t.select();
				t.caldiscount();
				System.out.println("Select 1 if u want to know your status\n");
				int status = sc.nextInt();
				if (status == 1) {
					t.status();
				}
				break;

			case 2:
				System.out.println("Holiday Package is selected\n");
				HolidayPackage h = new HolidayPackage();
				h.select();
				h.caldiscount();
				System.out.println("Select 1 if u want to know your status\n");
				status = sc.nextInt();
				if (status == 1) {
					h.status();
				}
				break;

			case 3: {
				System.out.println("Bed and Breakfast package is selected\n");
				BedandBreakfast b = new BedandBreakfast();
				b.select();
				b.caldiscount();
				System.out.println("Select 1 if u want to know your status\n");
				status = sc.nextInt();
				if (status == 1) {
					b.status();
				}
				break;
			}
			}

		}
	}

}
