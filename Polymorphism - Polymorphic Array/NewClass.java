package myJavaProject;

// This is a subclass to SuperClass

public class NewClass extends SuperClass{  // use extends SuperClass for inheritance 

	// even though this method is being inherited from SuperClass, you can still
	// modify this eat() method so its unique to this specific class
	void eat(){
		System.out.println("This beef is great");
	}
	
}
