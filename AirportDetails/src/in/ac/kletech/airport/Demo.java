package in.ac.kletech.airport;

import in.ac.kletech.airport.Airport.Traveller;

public class Demo {

	
	public static void main(String[] args) {
		Traveller T=new Traveller("Shweta",4,8123764042l,2016);
		System.out.println("Baggage check="+T.checkedinBaggage(T));
		
		System.out.println("Expiry check="+T.checkExpiry(T));
	}
}
