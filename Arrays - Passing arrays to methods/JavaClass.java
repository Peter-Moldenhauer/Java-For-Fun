package myJavaProject;

// Pass arrays into methods  

public class JavaClass {
	public static void main(String args[]){
		
		int myArray[] = {1,2,3,4,5,6,7};
		
		// call the changeArray method
		changeArray(myArray);
		
		// print out "new" array elements using ENHANCED for loop
		for(int y: myArray){
			System.out.println(y);
		}
	}
	
	// This method is outside of the main method (inside the class but outside the main method)
	public static void changeArray(int x[]){
		// take all of the values in the array and add 3 to them...
		for(int i = 0; i < x.length; i++){
			x[i] = x[i] + 3;
		}
	}
	
}
