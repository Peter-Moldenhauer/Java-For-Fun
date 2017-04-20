package myJavaProject;


// private vs. public variables in classes
// public - any class can use that variable 
// private - only the methods inside of the given class can use the variable 

public class NewClass {

	private String favoriteFood;
	
	// a constructor is just like a method except that a constructors 
	// name is the exact same thing as the class's name 
	public NewClass(String food){
		favoriteFood = food; 
	}
	
	public void outputText(){
		System.out.printf("Your favorite food is %s.\n", favoriteFood);
	}
}
