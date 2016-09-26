package in.ac.kletech;

public class Customer {
	private int iCustID;
	private String sCustName;
	private String sAddress;
	private long lTeleNo;
	
	Customer(int iCustID, String sCustName, String sAddress, long lTeleNo){
		this.iCustID=iCustID;
		this.sCustName=sCustName;
		this.sAddress=sAddress;
		this.lTeleNo=lTeleNo;
	}
	
	
	public int getiCustID() {
		return iCustID;
	}


	public String getsCustName() {
		return sCustName;
	}


	public String getsAddress() {
		return sAddress;
	}

	public long getlTeleNo() {
		return lTeleNo;
	}



	public boolean validateTeleNo(){
	//	if(this.lTeleNo.length()==10 && (this.lTeleNo.charAt(0)=='7' || this.lTeleNo.charAt(0)=='8' || this.lTeleNo.charAt(0)=='9'))
		if(lTeleNo==10 )
		{
				System.out.println("Telephone No is valid");
				return true;	
		}
		else
			{
				System.out.println("Telephone no is invalid");
				return false;
			}	
	}
	
	public boolean validateCustName(){
		if(this.sCustName.length()>4 && this.sCustName.length()<20){
			System.out.println("Customer name is valid");
			return true;
		}	
		else
		{
			System.out.println("Customer name is not valid");
			return false;
		}	
	}
	
	public void displayDetails(int iCustID, String sCustName, String sAddress, long lTeleNo){
		System.out.println("Customer ID:"+iCustID);
		System.out.println("Customer Name:"+sCustName);
		System.out.println("Customer Address:"+sAddress);
		System.out.println("Telephone No:"+lTeleNo);
	}

}
