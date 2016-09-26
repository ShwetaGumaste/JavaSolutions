package in.ac.kletech;

public class ItemDetails {
	private int iItemID;
	private double dItemPrice;
	
	ItemDetails(int iItemID, double dItemPrice){
		this.iItemID=iItemID;
		this.dItemPrice=dItemPrice;
	}
	
	public boolean validateItemID(){
		if((iItemID==1001 || iItemID==1002 || iItemID==1003 || iItemID==1004 || iItemID==1005) && dItemPrice>=5){
			System.out.println("Item ID is valid");
			return true;
		}
		else
		{
			System.out.println("ItemID is not valid");
			return false;
		}	
	}

	public void displayDetails(){
		
		
	}

}
