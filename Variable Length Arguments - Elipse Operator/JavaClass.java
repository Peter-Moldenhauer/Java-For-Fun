package myJavaProject;

// Variable length argument list - building a method without knowing how many arguments 
// that it will take 

public class JavaClass {
	public static void main(String args[]){
		
		// call the method to print an average of a random number of number arguments
		System.out.println(returnAverage(34,2,55,89,19));
		
		// call method again using a different number of arguments
		System.out.println(returnAverage(34,2,55,89,19,189,876,37));
	}
	
	// method outside of main - use int because it will return an int 
	// Anytime you dont know how many args to use, use an elipse (...) and then name of variable you want to use
	public static int returnAverage(int ...numbers){
		int total = 0; 
		
		// Enhanced for loop
		for(int x:numbers){
			total = total + x; 
		}
		
		// Return the average
		return total/numbers.length; 
	}
	
}
