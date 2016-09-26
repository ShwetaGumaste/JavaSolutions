package in.ac.kletech.minor1;

public class CustomerDemo {
	public static void main(String[] args) {
		
		int i;
		Customer[] c=new Customer[5];
		c[0]=new RegCustomer(01,"a",1234,20000,0.05);
		c[1]=new PriCustomer(02,"b",9876,1000,"A");
		c[2]=new RegCustomer(03,"b",1485,3000,0.02);
		c[3]=new PriCustomer(04,"d",6570,8000,"B");
		c[4]=new PriCustomer(05,"e",5803,5000,"A");
		for(i=0;i<c.length;i++)
		{
			c[i].printCustInfo(c[i]);
		}
		for(i=0;i<c.length;i++)
		{
			c[i].billAmt=c[i].computeBill();
			System.out.println("Bill Amount of Customer :"+(i+1)+":"+c[i].billAmt);
		}
		for(i=0;i<c.length;i++)
		{
			c[i].printCustInfo(c[i]);
		}
	
	}
}
