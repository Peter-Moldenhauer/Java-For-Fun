package myJavaProject;

// Composition - A class (along with its own variables and methods) it can also have 
// references to other objects from other classes. 

public class JavaClass {
	public static void main(String args[]){
		
		// create an object of AnotherClass
		AnotherClass object1 = new AnotherClass(4,5,6); // <--outputs: The constructor for this is 4/5/6
		
		NewClass object2 = new NewClass("Peter", object1); 
		
		System.out.println(object2);
 
	}
	
	
}

/* Output:
The constructor for this is 4/5/6
My name is Peter, my birthday is 4/5/6
*/