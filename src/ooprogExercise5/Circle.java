package ooprogExercise5;

public class Circle {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void displayInfo() {
		double area = 3.14159 * radius * radius;
		System.out.print("Area of the circle: " + area);
	}
}
