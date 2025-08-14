package ooprogConstructorProblem3;

public class Main {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.displayInfo();
		
		Laptop l2 = new Laptop("Dell","Unknown", 0.0);
		l2.displayInfo();
		
		Laptop l3 = new Laptop("HP", "Pavillion", 0.0);
		l3.displayInfo();
		
		Laptop l4 = new Laptop("Apple", "Mackbook", 999.99);
		l4.displayInfo();

	}
}
