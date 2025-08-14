package ooprogExercise2;

public class Student {
	String name;
	int id;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Student ID: " + id);
	}
}
