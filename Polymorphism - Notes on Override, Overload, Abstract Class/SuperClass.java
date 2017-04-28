package myJavaProject;

// SuperClass is the super class for AnotherClass and NewClass
// NewClass and AnotherClass will inherit all of the variables and methods in SuperClass

// Abstract Class - You can use this class to write methods in that subclasses use but you 
// cant create any objects of this specific class 

// To make an abstract class, just type abstract in front (of the SuperClass class)

abstract public class SuperClass {

	void eat(){
		System.out.println("This food is great");
	}
	
}
