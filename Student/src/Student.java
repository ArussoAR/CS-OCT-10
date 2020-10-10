
public class Student {
	
	public void setStudentName(String name) {
		System.out.println("Student name");
	}
	
	public void setStudentMajor(String major, int ID) {
		System.out.println("Student major");
	}

	public void setStudentGPA(double gpa) {
		System.out.println("Student GPA");
	}
	
	public static void main(String[] args) {
		
		Student information = new Student();
		information.setStudentName("Alex");
		var name = "Alex";
		
		information.setStudentMajor("Business", 10064);
		var major = "Business";
		int ID = 10064;
		
		information.setStudentGPA(7.86);
		double GPA = 7.86;
		

	}

}
