package myJavaProject;

// Simple averaging program...input numbers, get average

import java.util.Scanner;

public class JavaClass {
	public static void main(String args[]){
		
		// create scanner object
		Scanner input = new Scanner(System.in); 
		
		int total = 0; 
		int grade;
		int average;
		int counter = 0; 
		
		while(counter < 10){
			System.out.println("Enter a number here:");
			grade = input.nextInt(); // .nextInt() allows for whatever number you input to be stored in the variable grade
			total = total + grade;
			counter++;
		}
		
		// find the average
		average = total / 10;
		System.out.println("The average is: " + average);
		
	}
}

