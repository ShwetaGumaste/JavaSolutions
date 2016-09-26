package in.ac.kletech.airport;

public class TravellerDemo {
	public static void main(String[] args) {
		Traveller t1 = new Traveller(1, 35f, 2016, true);

		System.out.println("Traveller ID :" + t1.getiTravellerID());
		System.out.println("Baggage Amount :" + t1.getfBaggageAmount());
		System.out.println("Expiry Year :" + t1.getiExpiryYear());
		System.out.println("NOC Status :" + t1.getbNOCStatus());

		Checks c = new Checks();
		// boolean se= c.checkSecurity(t1);

		c.X(t1);

	}
}
