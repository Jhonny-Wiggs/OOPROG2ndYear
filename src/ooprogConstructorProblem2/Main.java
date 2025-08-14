package ooprogConstructorProblem2;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.displayInfo();
		
		Employee e2 = new Employee("John");
		e2.displayInfo();
		
		Employee e3 = new Employee("Alice", 50000.0);
		e3.displayInfo();
	}

}
