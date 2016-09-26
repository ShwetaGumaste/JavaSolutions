package in.ac.kletech.minor1;


	import java.util.Scanner;

	abstract class Customer
	{
		int custId;
		String custName;
		int phoneNum;
		double billAmt;
		Customer(){}
		Customer(int custId,String custName,int phoneNum,double billAmt)
		{
			this.custId=custId;
			this.custName=custName;
			this.phoneNum=phoneNum;
			this.billAmt=billAmt;
		}
		public String toString()
		{
			return custId+":"+custName+":"+phoneNum+":"+billAmt;
		}
		abstract double computeBill();
		void printCustInfo(Customer c)
		{
			System.out.println(c);
		}
	}
	class RegCustomer extends Customer
	{
		double discount;
		String t;
		static int rc;
		Scanner sc=new Scanner(System.in);
		RegCustomer(){}
		RegCustomer(int custId,String custName,int phoneNum,double billAmt,double discount)
		{
			super(custId,custName,phoneNum,billAmt);
			this.discount=discount;
			rc++;
		}
		void printCustInfo(RegCustomer r)
		{
			System.out.println(r);
			System.out.println(r.discount);
		}
		double computeBill()
		{
			System.out.println("It is the first time");
			t=sc.next();
			if(t.equals("Y"))
				return (billAmt-(billAmt*discount));
			else
				return (billAmt-(billAmt*(discount+0.05)));
		}
		int noOfRegCust()
		{
			return rc;
		}
	}
	class PriCustomer extends Customer
	{
		String memCardType;
		static int pi;
		PriCustomer(){}
		PriCustomer(int custId,String custName,int phoneNum,double billAmt,String memCardType)
		{
			super(custId,custName,phoneNum,billAmt);
			this.memCardType=memCardType;
		}
		void printCustInfo(PriCustomer p)
		{
			System.out.println(p);
			System.out.println(p.memCardType);
		}
		double computeBill()
		{
			if(memCardType.equals("A"))
					return (billAmt-(billAmt*0.2));
			else
					return (billAmt-(billAmt*0.1));
		}

		int noOfPriCust()
		{
			return pi;
		}
	}



