package ooprogExercise3;

public class Rectangle {
	int length;
	int width;
	
	Rectangle(){
		length = 0;
		width = 0;
	}
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	void displayInfo() {
		int area = length * width;
		System.out.println("Default Rectangle Area: " + area);
	}
	
	void displayInfo2() {
		int area = length * width;
		System.out.println("Custom Rectangle Area: " + area);
	}
}
