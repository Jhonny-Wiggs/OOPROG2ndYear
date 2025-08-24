package ooprogConstructorProblemWithJOptionPane2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter name: ");
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary: "));
		String name2 = JOptionPane.showInputDialog("Enter name: ");
		double salary2 = Double.parseDouble(JOptionPane.showInputDialog("Enter salary: "));
		String name3 = JOptionPane.showInputDialog("Enter name: ");
		double salary3 = Double.parseDouble(JOptionPane.showInputDialog("Enter salary: "));
		
		Employee e1 = new Employee(name, salary, name2, salary2, name3, salary3);
		e1.displayInfo();
	}
}
