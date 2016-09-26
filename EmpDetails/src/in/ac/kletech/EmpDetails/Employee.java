package in.ac.kletech.EmpDetails;

public class Employee {
	private int iEmpID;
	private String sEmpName;
	private float fEmpBasicSalary;
	private float fAllowance;
	


	Employee(int iEmpID,String sEmpName,float fEmpBasicSalary)
	{
		this.iEmpID=iEmpID;
		this.sEmpName=sEmpName;
		this.fEmpBasicSalary=fEmpBasicSalary;
	}


	public int getiEmpID() {
		return iEmpID;
	}


	public String getsEmpName() {
		return sEmpName;
	}


	public float getfEmpBasicSalary() {
		return fEmpBasicSalary;
	}


	
	
float calNetSalary()
	{
		float grossSalary,Incometax,netSalary;
		fAllowance=(46.0f/100.0f)*fEmpBasicSalary;
		grossSalary=fEmpBasicSalary+fAllowance;
		
		System.out.println("Allowance is"+fAllowance);
		System.out.println("GrossSAlary is"+grossSalary);
		if(grossSalary<5000)
		
			Incometax=0f;
			
		else if(grossSalary>5001f&&grossSalary<10000f)
		
			Incometax=(10f/100f)*grossSalary;
		
		else if(grossSalary>10001f&&grossSalary<20000f)
			
			Incometax=(20f/100f)*grossSalary;
		
		else
			Incometax=(30f/100f)*grossSalary;
		System.out.println("Income tax to be paid is "+Incometax);
		
		netSalary=grossSalary-Incometax;
		return netSalary;
	}
}