package ooprogConstructorProblemWithJOptionPane3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String brand = JOptionPane.showInputDialog("Enter a brand: ");
		String model = JOptionPane.showInputDialog("Enter a brand: ");
		Double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price: "));
		String brand2 = JOptionPane.showInputDialog("Enter a brand: ");
		String model2 = JOptionPane.showInputDialog("Enter a brand: ");
		Double price2 = Double.parseDouble(JOptionPane.showInputDialog("Enter price: "));
		String brand3 = JOptionPane.showInputDialog("Enter a brand: ");
		String model3 = JOptionPane.showInputDialog("Enter a brand: ");
		Double price3 = Double.parseDouble(JOptionPane.showInputDialog("Enter price: "));
		String brand4 = JOptionPane.showInputDialog("Enter a brand: ");
		String model4 = JOptionPane.showInputDialog("Enter a brand: ");
		Double price4 = Double.parseDouble(JOptionPane.showInputDialog("Enter price: "));
		
		
		Laptop l1 = new Laptop(brand, model, price, brand2, model2, price2, brand3, model3, price3, brand4, model4, price4);
		l1.displayInfo();
	}
}
