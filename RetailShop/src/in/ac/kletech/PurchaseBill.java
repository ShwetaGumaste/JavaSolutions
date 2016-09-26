package in.ac.kletech;

public class PurchaseBill {


private int iBillID;
private int iQty;
private double iBillAmt;

PurchaseBill(int iBillID, int iQty, double iBillAmt){
	this.iBillID=iBillID;
	this.iQty=iQty;
	this.iBillAmt=iBillAmt;
}

double calculateBill(){
	double disc;
	if(iQty>0 && iQty<5)
	{
		iBillAmt=iQty*50f;
		
		if(iBillAmt>0 && iBillAmt<500f)
			disc=0f;
		else if(iBillAmt>=500 && iBillAmt<1000)
			disc=0.5f*iBillAmt;
		else
			disc=0.10f*iBillAmt;
		
		iBillAmt=iBillAmt-disc;
		return iBillAmt;
	}
	else{
		System.out.println("Quantity should be greater than 0 and less than 5");
		return 0;
	}	
}

public void displayDetails(int iBillID, int iQty, double iBillAmt){
	System.out.println("Bill ID is :"+iBillID);
	System.out.println("Quantity is :"+iQty);
	System.out.println("Bill Amount is :"+iBillAmt);
}
}