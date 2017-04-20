package myJavaProject;

// Using methods with parameters 

import java.util.Scanner;

public class JavaClass {
	public static void main(String args[]){
		 
		// create a scanner object named input
		Scanner input = new Scanner(System.in);
		
		// create an object from the NewClass class
		NewClass object1 = new NewClass();
		
		System.out.println("Please enter your name: ");
		
		// Anything that user enters will be stored in the variable "name" 
		String name = input.nextLine(); // anytime you want to input a string, use the nextLine method
		
		object1.simpleMessage(name);
	}
}

