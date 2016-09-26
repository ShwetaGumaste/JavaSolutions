package in.ac.kletech.airport;

public class Checks {
	public boolean checkBaggage(Traveller t1) {
		if (t1.getfBaggageAmount() >= 0 && t1.getfBaggageAmount() <= 40)
			return true;
		else
			return false;
	}

	public boolean checkImmigration(Traveller t1) {
		if (t1.getiExpiryYear() >= 2001 && t1.getiExpiryYear() <= 2025)
			return true;
		else
			return false;
	}

	public boolean checkSecurity(Traveller t1) {
		if (t1.getbNOCStatus() == true)
			return true;
		else
			return false;
	}

	public void X(Traveller t1) {
		if (this.checkSecurity(t1) == true && this.checkBaggage(t1) == true && this.checkSecurity(t1) == true)
			System.out.println("Allow Traveller to fly");
		else
			System.out.println("Detain Traveller for rechecking");
	}

}
