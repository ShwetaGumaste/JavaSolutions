package in.ac.kletech.airport;

interface Airport {
	 String sName="Shweta";
	 String scode="abc";
	 boolean bDutyfree=true;
	 
	 boolean checkedinBaggage(Traveller T);
	 
	 boolean checkExpiry(Traveller T);
	 
	 class Traveller implements Airport{
		 String sName;
		 double dweight;
		 long lcontactNo;
		 int expiryyear;
		 
		 public Traveller(String sName,double weight,long lcontactno,int expiryyear){
			 super();
			 this.sName=sName;
			 this.dweight=dweight;
			 this.lcontactNo=lcontactno;
			 this.expiryyear=expiryyear;
		 }
		 public boolean checkedinBaggage(Traveller T){
			 if(dweight>7)
			 {
				 System.out.println("Weight is invalid\n");
			 
				 return false;
				 
			
			 }
			 else
			 {
				 System.out.println("Weight is valid");
				 return true;
		    }
		 }
		public boolean checkExpiry(Traveller T){
			if(expiryyear>=2018)
				{
					System.out.println("Expiryyear is invalid\n");
					return false;
				}
			else
			{
				System.out.println("Expiryyear is valid");
				return true;
			}
			
		}
		 
	 
	 
}
}
