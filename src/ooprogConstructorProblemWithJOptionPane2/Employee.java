package ooprogConstructorProblemWithJOptionPane2;

import javax.swing.JOptionPane;

public class Employee {
	
	String name, name2, name3;
	double salary, salary2, salary3;
	
	Employee(String name, double salary, String name2, double salary2, String name3, double salary3){
		this.name = name;
		this.salary = salary;
		this.name2 = name2;
		this.salary2 = salary2;
		this.name3 = name3;
		this.salary3 = salary3;
	}
	
	void displayInfo() {
		JOptionPane.showMessageDialog(null, "Name: " + name + ", Salary: " + salary + "\n" +
				                            "Name: " + name2 + ", Salary: " + salary2 + "\n" +
				                            "Name: " + name3 + ", Salary: " + salary3 + "\n");
	}
}
