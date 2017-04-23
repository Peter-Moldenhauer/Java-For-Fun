package myJavaProject;

// Multiple Constructors 
// Depending on how many args you use, determine what constructor to use 

public class JavaClass {
	public static void main(String args[]){
		
		// Build 4 different objects of NewClass to demonstrate how 
		// each of the 4 different constructors are used (based on the number of 
		// arguments for each constructor). 
		
		NewClass object1 = new NewClass();
		NewClass object2 = new NewClass(5);
		NewClass object3 = new NewClass(5,13);
		NewClass object4 = new NewClass(5,13,43); 
		
		// Print out data for each object...
		
		System.out.printf("Object 1 - No args: %s\n", object1.toMilitaryTime());
		System.out.printf("Object 2 - One arg: %s\n", object2.toMilitaryTime());
		System.out.printf("Object 3 - Two args: %s\n", object3.toMilitaryTime());
		System.out.printf("Object 4 - Three args: %s\n", object4.toMilitaryTime());
		
 
	}
	
	
}

/* Output...
Object 1 - No args: 00:00:00
Object 2 - One arg: 05:00:00
Object 3 - Two args: 05:13:00
Object 4 - Three args: 05:13:43
*/