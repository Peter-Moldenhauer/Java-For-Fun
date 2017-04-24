package myJavaProject;

// Inheritance - inheriting stuff from another class 
// You can inherit methods from another class using the "extends" keyword 
// Note: only PUBLIC methods can be inherited from one class to another 

public class JavaClass {
	public static void main(String args[]){
		
		// make a NewClass object
		NewClass object1 = new NewClass();
		
		// make a AnotherClass object
		AnotherClass object2 = new AnotherClass(); 
		
		// Note: even though there are no methods in NewClass, 
		// the methods from SuperClass are inherited 
		
		object1.talk();
		object2.talk();  // overrides the inherited method - changes it to do its own thing 
		
	}
	
}

/* Output... 
I am the talk method
I am the talk method that overrides SuperClass!
*/ 