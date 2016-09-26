package in.ac.kletech.RetailShop;

public class Customer {
	private int icustid;
	private String sCustName;
	private String sAddress;
	private long lTeleNo;

public Customer(int icustid, String sCustName, String sAddress,long lTeleNo){
	this.icustid=icustid;
	this.sCustName=sCustName;
	this.sAddress=sAddress;
	this.lTeleNo=lTeleNo;
	this.validateCustName();
	this.validateTeleNo();
	this.display();
}
boolean validateTeleNo() {
	if((lTeleNo/1000000000l)==7||(lTeleNo/1000000000l==8)||(lTeleNo/1000000000l==9))
		{
		System.out.println("Telephone no is valid\n ");
		
		return true;
		}
	else
	{
		System.out.println("Telephone no is invalid\n ");
		return false;
	}
	
}
boolean validateCustName(){
	if(sCustName.length()>4&& sCustName.length()<20)
		{
			System.out.println("Customer Name is valid\n ");
			return true;
		}
	else
	{
		System.out.println("Customer name is invalid\n ");
	
		return false;
	}
}
void display(){
	System.out.println("Customer ID is "+icustid);
	System.out.println("Customer Name is "+sCustName);
	System.out.println("Customer Address is "+sAddress);
	System.out.println("Customer Telephone No is "+lTeleNo);
	
}
}