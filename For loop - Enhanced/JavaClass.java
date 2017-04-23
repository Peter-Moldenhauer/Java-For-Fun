package myJavaProject;

// Enhanced for loop 
// This is basically a for loop that is specialized to loop through 
// all of the elements in an array to do something with them..in this example 
// I just compute the sum. 

public class JavaClass {
	public static void main(String args[]){
		
		int myArray[] = {1,2,3,4,5,6,7};
		int sum = 0;
		
		// Enhanced for loop is different than a regular for loop for a few ways...
		// It only takes 2 (not 3) parameters - the type of data and the name of the array
		for(int x: myArray){
			sum += x;   // this will add each individual value of the array to the sum variable for each index
		}
		
		System.out.println("The sum of the array values: " + sum); //prints: 28
		
	}
}
