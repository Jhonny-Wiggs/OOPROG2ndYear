package ooprogConstructorProblem2;

public class Employee {
	String name;
	double salary;
	
	Employee(){
		name = "Not Assigned";
		salary = 0.0;
	}
	
	Employee(String name){
		this(name, 0.0);
	}
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	void displayInfo(){
		System.out.println("Name: " + name + ", Salary: " + salary);
	}
}
