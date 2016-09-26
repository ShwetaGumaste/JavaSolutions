package in.ac.kletech;

public class Test {
	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Sin", "Bhagyanagar", 7689809809l);
		c1.displayDetails(2, "Somya", "Tilakwadi", 8790877698l);
		//c1.validateTeleNo();
		c1.validateCustName();
		
		ItemDetails i = new ItemDetails(100, 500f);
		i.validateItemID();
		
		PurchaseBill b = new PurchaseBill(12, 4, 348.0);
		b.calculateBill();
		b.displayDetails(1, 3, 700f);

	}

}
