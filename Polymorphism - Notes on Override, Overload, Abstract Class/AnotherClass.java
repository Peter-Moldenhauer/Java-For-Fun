package myJavaProject;

// This is a subclass to SuperClass

public class AnotherClass extends SuperClass{
	
	// even though this method is being inherited from SuperClass, you can still
	// override this eat() method so its unique to this specific class
	// Note: to override this eat() method of SuperClass, it needs to have the same number of 
	// arguments as it does in the super class
	// Similarly, if the SuperClass eat() method returns anything, this overridden method 
	// needs to return the same type as well
	
	// Note: override and overloaded are two different things. Overload means that you 
	// have the same method name but have different arguments. 
	
	
	void eat(){
		System.out.println("This chicken is great");
	}
	
}
