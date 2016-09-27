package in.ac.kletech.HolBuddy;

public class Customer {

	String sCustomerName;
	int iCustomerId;
	String sAddress;
	long lTeleno;
	String Gender;
	int choice;

	public Customer(String sCustomerName, int iCustomerId, String sAddress, long lTeleNo, String Gender) {

		this.sCustomerName = sCustomerName;
		this.iCustomerId = iCustomerId;
		this.sAddress = sAddress;

		this.lTeleno = lTeleNo;
		this.Gender = Gender;
	}
}
