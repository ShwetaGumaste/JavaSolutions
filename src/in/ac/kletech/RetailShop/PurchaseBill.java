package in.ac.kletech.RetailShop;

public class PurchaseBill {
	
	

	private int iBillID;
	private int iQty;
	private double dbillAmt;

	public int getiBillID() {
		return iBillID;
	}

	public int getiQty() {
		return iQty;
	}

	public double getDbillAmt() {
		return dbillAmt;
	}

	public PurchaseBill(int iBillID, int iQty, double dbillAmt) {
		this.iBillID = iBillID;
		this.iQty = iQty;
		this.dbillAmt = dbillAmt;
		this.calculateBill();
		this.displayDetails();
	}

	Customer Santu = new Customer(1, "Shweta", "Hubli", 8123764042l);
	ItemDetails Golu = new ItemDetails( 23);

	public double calculateBill() {
		double discount = 0;
		double totalBill = 0;
		if(ItemDetails.getCounter()>0 && ItemDetails.getCounter()<=11)
		if (iQty > 0 && iQty < 5) {
			if (dbillAmt >= 1000)
				discount = 0.1d * dbillAmt;
			else if (dbillAmt >= 500 && dbillAmt < 1000)
				discount = 0.05d * dbillAmt;
			else if (dbillAmt > 0 && dbillAmt < 500)
				discount = 0;
			totalBill = dbillAmt - discount;
		
			
			return totalBill;
		} else {
			System.out.println("Inappropriate details");
			
			return 0;
		}
		return 0;

	}

	void displayDetails() {
		System.out.println("Bill amt is "+dbillAmt);
		System.out.println("Total Bill is " + calculateBill());

	}
}
