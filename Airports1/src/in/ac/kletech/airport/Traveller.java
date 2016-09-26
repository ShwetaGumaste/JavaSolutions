package in.ac.kletech.airport;

public class Traveller {
	private int iTravellerID;
	private float fBaggageAmount;
	private int iExpiryYear;
	private boolean bNOCStatus;

	Traveller(int iTravellerID, float fBaggageAmount, int iExpiryYear, boolean bNOCStatus) {
		this.iTravellerID = iTravellerID;
		this.fBaggageAmount = fBaggageAmount;
		this.iExpiryYear = iExpiryYear;
		this.bNOCStatus = bNOCStatus;
	}

	public float getfBaggageAmount() {
		return fBaggageAmount;
	}

	public int getiTravellerID() {
		return iTravellerID;
	}

	public int getiExpiryYear() {
		return iExpiryYear;
	}

	public boolean getbNOCStatus() {
		return bNOCStatus;
	}

}
