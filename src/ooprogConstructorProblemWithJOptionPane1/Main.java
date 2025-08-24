package ooprogConstructorProblemWithJOptionPane1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter a name: ");
		String grade = JOptionPane.showInputDialog("Enter a grade: ");
		String name2 = JOptionPane.showInputDialog("Enter a name: ");
		String grade2 = JOptionPane.showInputDialog("Enter a grade: ");
		String name3 = JOptionPane.showInputDialog("Enter a name: ");
		String grade3 = JOptionPane.showInputDialog("Enter a grade: ");
		
		Student s1 = new Student(name, grade, name2, grade2, name3, grade3);
		s1.displayInfo();
	}
}
