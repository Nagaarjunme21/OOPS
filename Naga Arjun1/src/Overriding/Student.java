package Overriding;

public class Student {
	
	private static String studentNane;
	private static int studentid;
	private static String studentName;
	private static String studentLocation;
	
	static void studentData(int studentId) {
	System.out.println("student id :" +studentId);
	}

	static void studentData(int studentId, String studentName) {
		
	System.out.println("student id is :" + studentId);
	System.out.println("student id is :"+ studentName);
	}
	
	
	static void studentData(int studentId, String studentName, String studentLocation) {
		
	System.out.println("student id is :" + studentId);
	System.out.println("student id is :" + studentNane);
	System.out.println("student id is :" +studentLocation);
	}
	
	
	static String studentdata() {
	 return "Bangalore";
	}
	
	
	public static void main(String[] args) {
		studentData( studentid 121 ); 
		studentData( studentid 122, studentName: "arjun");
		studentData( studentid 123, studentName: "arun", studentLocation: "Bangalore");
		System.out.println("Location :" +studentdata());
			
	
	
	}

}
