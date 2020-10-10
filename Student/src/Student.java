
public class Student {
	
	// method one is for the Students name
	public void setStudentName(String name) {    //parameter is String
		System.out.println("Student name");
	}
	
	//method two is for the Students major
	public void setStudentMajor(String major, int ID) {   //parameter is String and int 
		System.out.println("Student major");
	}
	
	// method three is for the Student GPA
	public void setStudentGPA(double gpa) {     // parameter is double GPA
		System.out.println("Student GPA");
	}
	
	public static void main(String[] args) {
		//call the method by using the object 
		Student information = new Student();
		
		// this is the method call for the Students name
		information.setStudentName("Alex");
		var name = "Alex";
		
		// this is the method call for the Students major
		information.setStudentMajor("Business", 10064);
		var major = "Business";
		int ID = 10064;
		
		// this is the method call for the Student GPA
		information.setStudentGPA(7.86);
		double gpa = 7.86;
		

	}

}
