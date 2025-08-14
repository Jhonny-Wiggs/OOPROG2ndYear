package ooprogConstructorProblem123;

public class Laptop {
	String brand;
	String model;
	double price;
	
	Laptop(){
		this("Unknown", "Unknown", 0.0);
	}
	
	Laptop(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void displayInfo() {
		System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
	}
}

