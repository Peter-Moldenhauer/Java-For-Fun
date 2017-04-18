package myJavaProject;

// Build a basic calculator 

import java.util.Scanner; 

public class JavaClass {
	public static void main(String args[]){
		 
		// make a scanner variable
		Scanner myVar = new Scanner(System.in);  // The system.in tells where to get the input from
		
		double firstNum, secNum, sum; 
		
		System.out.println("Enter the first number: ");
		firstNum = myVar.nextDouble();  // Note, nextLine is for strings, the nextDouble method works on doubles 
		
		System.out.println("Enter the second number: ");
		secNum = myVar.nextDouble();
		
		sum = firstNum + secNum;
		
		System.out.println("The sum of the numbers is: " + sum);
	}
}

