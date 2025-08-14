package ooprogExercise4;

public class Employee {
	String name;
	int id;
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	Employee(String name){
		this(name,0);
	}
	
	void displayInfo() {
		System.out.println("Employee 1: Name = " + name + ", ID = " + id);
	}
	
	void displayInfo2() {
		System.out.println("Employee 2: Name = " + name + ", ID = " + id);
	}
}
