package ooprogConstructorProblem1;

public class Student {
	String name;
	String grade;
	
	Student(){
		name = "No Name";
		grade = "Not Assigned";
	}
	
	Student(String name){
		this(name, "Not Assigned");
	}
	
	Student(String name, String grade){
		this.name = name;
		this.grade = grade;
	}
	
	void displayInfo(){
		System.out.println("Name: " + name + ", Grade: " + grade);
	}
}

