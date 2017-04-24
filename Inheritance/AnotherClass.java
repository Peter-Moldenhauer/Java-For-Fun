package myJavaProject;

//This is a subclass, it will inherit from the superclass 
// The keyword "extends" means "inherit from" 

public class AnotherClass extends SuperClass{
	
	// To override the inherited methods from the superclass, just put the 
	// same method in the subclass and recreate it...
	
	public void talk(){
		System.out.println("I am the talk method that overrides SuperClass!");
	}
	
}
