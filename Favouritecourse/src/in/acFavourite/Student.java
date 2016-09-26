package in.acFavourite;

public class Student {

int rollNo;
String stuName;
Attendance[] att=new Attendance[3];
Student()
{
}
Student(int rollNo, String stuName)
{
	this.rollNo=rollNo;
	this.stuName=stuName;
	  att[0]=new Attendance(201,"DS",60);
	  att[1]=new Attendance(202,"DSD",75);
	  att[2]=new Attendance(203,"OOPS",85);
}
void printStudent()
{
	
	System.out.println("the student detail is"+stuName+":"+rollNo);
	for(int i=0;i<3;i++)
	{
		System.out.print("courseNo:  "+att[i].courseNo+"courseTitle:  "+att[i].courseTitle);
	}
}
void findCourseWithBelowAvgAtt(Attendance[] att)
{
	for(int i=0;i<3;i++)
	{
		if(att[i].percentageAttendence<75)
		{
			System.out.println("the student detail is"+stuName+":"+rollNo+"courseNo"+att[i].courseNo+"percentageAttendence"+att[i].percentageAttendence);
		}
	}
	
}
void findCourse(Attendance[] att,String courseTitle)
{
		for(int i=0;i<3;i++)
		{
			if(att[i].courseTitle.equals(courseTitle))
			{
		       System.out.println("the Attendance detail is"+"courseNo"+att[i].courseNo+"percentageAttendence"+att[i].percentageAttendence);
			}
		}
}
}
