package myJavaProject;

// random number generator - such as for a dice roll

import java.util.Random; 

public class JavaClass {
	public static void main(String args[]){
		
		// create an object for the random util
		Random ranObj = new Random();       // now that we have this object, we can use random numbers
		
		// create a temp variable to store the number that is outputted on the dice 
		int number; 
		
		// roll the dice 10 times using a for loop
		for(int i = 0; i < 10; i ++){
			// assign a random number from 1 - 6 to the number variable...
			number = 1+ranObj.nextInt(6); 
			
			System.out.println(number + " ");
		}
	}
}

