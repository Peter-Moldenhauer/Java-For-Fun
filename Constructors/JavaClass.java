package myJavaProject;

// Constructors 
// Constructors allow you to initialize variables as soon as you create an object


public class JavaClass {
	public static void main(String args[]){
		
		// create an object from the NewClass class
		NewClass object1 = new NewClass("bacon");
		
		object1.outputText();  // output: Your favorite food is bacon. 
		
		//do it again just for practice
		NewClass object2 = new NewClass("cake");
		
		object2.outputText(); // output: Your favorite food is cake. 
	}
}

