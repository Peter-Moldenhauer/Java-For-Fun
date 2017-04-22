package myJavaProject;

// Intro to arrays
// Arrays can only store values of the same data type 

public class JavaClass {
	public static void main(String args[]){
		
		// create an integer array 
		int myArray[] = new int[10];  // the 10 is for how many values will go in the array
		
		// assign values to the array based on the index...
		myArray[0] = 91;
		myArray[4] = 345;
		myArray[7] = 22;
		
		// print out the value at a given index of the array...
		System.out.println(myArray[4]);  // prints: 345 
		
		
		// ----------------------------------------------------
		
		// Array initializer example...
		
		int myArray2[] = {4, 6, 8, 10, 12}; 
		
		System.out.println(myArray2[0]);  // prints: 4
		System.out.println(myArray2[3]);  // prints: 10
		
	}
}

