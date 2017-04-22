package myJavaProject;

// math class methods 

public class JavaClass {
	public static void main(String args[]){
		
		// absolute value 
		System.out.println("Absolute value of -26.7: " + Math.abs(-26.7));  // answer: 26.7
		
		//ceiling - any number you give it, it will round up, even if it "should" round down
		System.out.println("Ceiling of 7.4: " + Math.ceil(7.4));  // answer: 8 
		
		// floor - opposite of ceil, always rounds down
		System.out.println("Floor of 7.8: " + Math.floor(7.8));  // answer: 7
		
		// max - takes multiple parameters, give it two numbers and it gives the max of the two
		System.out.println("The max # of 8.6 and 7.2: " + Math.max(8.6, 7.2)); // answer: 8.6
		
		// min - Like max, but gives the min number of the two numbers given to it
		System.out.println("The min # of 8.6 and 7.2: " + Math.min(8.6, 7.2)); // answer: 7.2
		
		// power - takes 2 parameters, 1st param is the base num, 2nd param is the power to raise it to
		System.out.println("5 to the 3rd power is: " + Math.pow(5, 3)); // answer: 125 
		
		// sqrt - square root, takes 1 parameter and finds the square root of the given number
		System.out.println("Square root of 121: " + Math.sqrt(121)); // answer: 11
	}
}

