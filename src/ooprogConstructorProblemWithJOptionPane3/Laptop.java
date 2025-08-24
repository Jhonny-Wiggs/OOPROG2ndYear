package ooprogConstructorProblemWithJOptionPane3;

import javax.swing.JOptionPane;

public class Laptop {
	String brand, brand2, brand3, brand4;
	String model, model2, model3, model4;
	double price, price2, price3, price4;
	
	Laptop(String brand, String model, double price, String brand2, String model2, double price2, String brand3, String model3, double price3, String brand4, String model4, double price4){ 
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.brand2 = brand2;
		this.model2 = model2;
		this.price2 = price2;
		this.brand3 = brand3;
		this.model3 = model3;
		this.price3 = price3;
		this.brand4 = brand4;
		this.model4 = model4;
		this.price4 = price4;
	}
	
	void displayInfo() {
		JOptionPane.showMessageDialog(null, "Brand: " + brand + ", Model: " + model + ", Price: " + price + "\n" +
                                            "Brand: " + brand2 + ", Model: " + model2 + ", Price: " + price2 + "\n" +
                                            "Brand: " + brand3 + ", Model: " + model3 + ", Price: " + price3 + "\n" +
                                            "Brand: " + brand4 + ", Model: " + model4 + ", Price: " + price4);
	}
}
