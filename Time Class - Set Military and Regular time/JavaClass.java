package myJavaProject;

// Time class - a separate class that has a bunch of time functions
// This program allows the user to enter in 3 numbers (hours, mins, seconds) and 
// then it will convert it into military and regular time. 

public class JavaClass {
	public static void main(String args[]){
		
		NewClass newClassObject = new NewClass(); 
		
		newClassObject.setTime(13, 27, 6);
		
		// call toMilitary function
		System.out.println(newClassObject.toMilitary());  // output: 13:27:06
		
		// call toRegular function
		System.out.println(newClassObject.toRegular());  // output: 1:27:06 PM 
	}
	
	
}
