package javabasics;

public class StudentDetails {
	String studentName;
	long studentphoneno;
	int studentAge;
	String studentemailid;
	String studentgender;
	StudentDetails(String sName,long phoneno,int age, String email,String gender){
		studentName=sName;
		studentphoneno=phoneno;
		studentAge=age;
		studentemailid=email;
		studentgender=gender;
	}
	void display() {
		System.out.println(studentName+" "+studentAge+" "+studentgender+" "+studentphoneno+" "+studentemailid);
	}
	
public static void main(String[] args) {
	StudentDetails std=new StudentDetails("Bhavaya",9945632109L,23,"bhavya@gmail.com","Female");
	std.display();
	StudentDetails std1=new StudentDetails("Moksha",9942762109L,21,"moksha@gmail.com","Male");
	std1.display();
	
	
	
	
		
	}

}
