package myJavaProject;

// Polymorphism


public class JavaClass {
	public static void main(String args[]){
		
		// With polymorphism, any class that inherits from SuperClass can now 
		// be assigned to bucky
		// Before, we just did: SuperClass bucky = new SuperClass();
		// but now we can do this...
		// SuperClass bucky = new AnotherClass(); 
		
		// So similarly, we can make a polymorphic array...
		
		// Polymorphic Array example,
		// This stores objects of different classes in the SuperClass type 
		
		// Note: Since this is of SuperClass type, it can hold objects of NewClass and AnotherClass
		SuperClass bucky[] = new SuperClass[2]; 
		
		// so we can do this...
		bucky[0] = new AnotherClass(); 
		bucky[1] = new NewClass(); 
		
		// this will loop through each one of the "different" objects and call the eat() method
		// You can assign different objects to variables as long as the reference variable (bucky[]) is of the SuperClass type
		for(int x = 0; x < bucky.length; ++x){
			bucky[x].eat();
		}
		
		// This is useful because it prevents you from building a brand new object for each 
		// "different" class and then individually calling the methods for each of those objects
	}
	
}

/* Output
This chicken is great
This beef is great
*/

