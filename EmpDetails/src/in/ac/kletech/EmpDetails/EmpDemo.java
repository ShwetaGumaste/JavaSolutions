package in.ac.kletech.EmpDetails;

public class EmpDemo {

	
	public static void main(String[] args) {
	Employee Shweta=new Employee(1,"Shweta",100000f);
    System.out.println("EmpID:"+Shweta.getiEmpID());
    System.out.println("Emp Name:"+Shweta.getsEmpName());
    System.out.println("Emp Basic Salary:"+Shweta.getfEmpBasicSalary());
    float salary1=Shweta.calNetSalary();
    
    System.out.println("Emp Net Salary:"+salary1);
    System.out.println("\n");
    Employee Golu=new Employee(2,"Golu",75000f);
    
    System.out.println("EmpID:"+Golu.getiEmpID());
    System.out.println("Emp Name:"+Golu.getsEmpName());
    System.out.println("Emp Basic Salary:"+Golu.getfEmpBasicSalary());
    
    float salary2=Golu.calNetSalary();
    System.out.println("Emp Net Salary:"+salary2);
    System.out.println("\n");
    
    Employee Santosh=new Employee(3,"Santosh",155000f);
    
    System.out.println("EmpID:"+Santosh.getiEmpID());
    System.out.println("Emp Name:"+Santosh.getsEmpName());
    System.out.println("Emp Basic Salary:"+Santosh.getfEmpBasicSalary());
    
    float salary3=Santosh.calNetSalary();
    System.out.println("Emp Net Salary:"+salary3);
    System.out.println("\n");
    float lowestsalary;
    if(salary1<salary2 && salary1<salary3)
    {
          lowestsalary=salary1;
          System.out.println("Lowest salary is\t "+lowestsalary);
          System.out.println("of  "+Shweta.getsEmpName());
	}
    else if(salary2<salary1 && salary2<salary3)
    {
         lowestsalary=salary2;
         System.out.println("Lowest salary is\t "+lowestsalary);
         System.out.println("of  "+Golu.getsEmpName());
	}
    else 
    	{
    	lowestsalary=salary3;
    	
    	System.out.println("Lowest salary is\t "+lowestsalary);
    	System.out.println("of  "+Santosh.getsEmpName());
	
    	}

}
}
