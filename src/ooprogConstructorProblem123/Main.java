package ooprogConstructorProblem123;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.displayInfo();
		Student s2 = new Student("Alice");
		s2.displayInfo();
		Student s3 = new Student("Bob", "A");
		s3.displayInfo();
		
		System.out.println();
		
		Employee e1 = new Employee();
		e1.displayInfo();
		Employee e2 = new Employee("John");
		e2.displayInfo();
		Employee e3 = new Employee("Alice", 50000.0);
		e3.displayInfo();
		
		System.out.println();
		
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
