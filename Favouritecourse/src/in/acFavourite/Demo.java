package in.acFavourite;

public class Demo {

	public static void main(String[] args) 
	{
		Student[] stu=new Student[5];
		stu[0]=new Student(1001,"Shweta");
		stu[1]=new Student(1002,"Sindhu");
		stu[2]=new Student(1003,"Golu");
		stu[3]=new Student(1004,"rahul");
		stu[4]=new Student(1005,"santu");
		Attendance[] a=new Attendance[3];
		for(int i=0;i<5;i++)
		{
			stu[i].printStudent();
		}
		for(int i=0;i<5;i++)
		{
			stu[i].findCourse(a,"DS");
		}
		for(int i=0;i<5;i++)
		stu[i].findCourseWithBelowAvgAtt(a);
	}

}
