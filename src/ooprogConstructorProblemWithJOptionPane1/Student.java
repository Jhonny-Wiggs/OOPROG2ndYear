package ooprogConstructorProblemWithJOptionPane1;

import javax.swing.JOptionPane;

public class Student {
	String name, name2, name3;
	String grade, grade2, grade3;
	
	Student(String name, String grade, String name2, String grade2, String name3, String grade3){
		this.name = name;
		this.grade = grade;
		this.name2 = name2;
		this.grade2 = grade2;
		this.name3 = name3;
		this.grade3 = grade3;
	}
	
	void displayInfo(){
		JOptionPane.showMessageDialog(null, "Name: " + name + ", Grade: " + grade + "\n" +
				                            "Name: " + name2 + ", Grade: " + grade2 + "\n" +
				                            "Name: " + name3 + ", Grade: " + grade3 + "\n");
	}
}
