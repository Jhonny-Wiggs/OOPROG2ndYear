package ooprogExercise1;

public class Book {
	String title;
	String author;
	
	Book(){
		title = "Unknown Title";
		author = "Unknown Author";
	}
	
	void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
}
