package ooprogConstructorProblem1;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.displayInfo();
		
		Student s2 = new Student("Alice");
		s2.displayInfo();
		
		Student s3 = new Student("Bob", "A");
		s3.displayInfo();
	}

}
