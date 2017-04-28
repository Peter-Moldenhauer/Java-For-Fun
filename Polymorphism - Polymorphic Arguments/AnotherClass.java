package myJavaProject;

// This is a subclass to SuperClass

public class AnotherClass extends SuperClass{
	
	// even though this method is being inherited from SuperClass, you can still
	// modify this eat() method so its unique to this specific class
	void eat(){
		System.out.println("This chicken is great");
	}
	
}
