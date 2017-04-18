package myJavaProject;

// Get input from the user

import java.util.Scanner;  // Tell Java that you want to use the scanner (to get input from the keyboard)

public class JavaClass {
	public static void main(String args[]){
		 
		// make a variable that is going to hold the input from the keyboard 
		Scanner myVariable = new Scanner(System.in); // The myVariable variable is assigned whatever information is typed in from the keyboard
	
		// Print out the user input to the screen
		System.out.println(myVariable.nextLine());  // the .nextLine is used so that it pauses and waits until it gets input from the new Scanner line
	}
}

