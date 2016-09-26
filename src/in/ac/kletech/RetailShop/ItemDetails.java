package in.ac.kletech.RetailShop;

public class ItemDetails {
	private static int counter=1;
	private int iItemID;
	private double dItemPrice;
	
	public int getiItemID() {
		return iItemID;
	}
	public double getdItemPrice() {
		return dItemPrice;
	}
	public static int getCounter() {
		return counter;
	}
	

	
	public ItemDetails(double dItemPrice) {
		super();
		this.iItemID = counter++;
		this.dItemPrice = dItemPrice;
		this.displayDetails();
		//this.validateItemID();
		
	}
	/*boolean validateItemID(){
	
		if((iItemID==1001 ||iItemID==1002||iItemID==1003||iItemID==1004||iItemID==1005) && dItemPrice>=5 )
		{
			System.out.println("Item ID is valid");
			return true;
		}
		else
			{
			System.out.println("Item ID is invalid");
			
			return false;
			}
		
	}
	*/
 void displayDetails(){
	 System.out.println("The item ID is "+iItemID);
	 System.out.println("The item price is "+dItemPrice);
 }
	

}
