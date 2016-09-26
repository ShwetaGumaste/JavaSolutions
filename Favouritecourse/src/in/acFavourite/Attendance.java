package in.acFavourite;

public class Attendance {
	int courseNo;
	String courseTitle;
	int percentageAttendence;
	Student[] s = new Student[5];

	Attendance() {
	}

	Attendance(int courseNo, String courseTitle, int percentageAttendence) {
		this.courseNo = courseNo;
		this.courseTitle = courseTitle;
		this.percentageAttendence = percentageAttendence;
	}

	void display() {
		System.out.println("Course:" + courseTitle + "courseNo:" + courseNo);
	}
}
