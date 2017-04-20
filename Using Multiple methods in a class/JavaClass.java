package myJavaProject;

// Using multiple methods and instance variables when working with classes

import java.util.Scanner;

public class JavaClass {
	public static void main(String args[]){
		 
		// create a scanner object named input
		Scanner input = new Scanner(System.in);
		
		// create an object from the NewClass class
		NewClass object1 = new NewClass();
		
		System.out.println("Please enter your favorite food: ");
		
		// Anything that user enters will be stored in the variable "name" 
		String favFood = input.nextLine(); 
		
		object1.setFood(favFood);
		
		object1.outputText();  // output: Your favorite food is ...... 
	}
}

