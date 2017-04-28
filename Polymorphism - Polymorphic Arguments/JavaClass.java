package myJavaProject;

// Polymorphism


public class JavaClass {
	public static void main(String args[]){
		
		Monster mObject = new Monster(); 
		
		// need to create a SuperClass object because the method in Monster class 
		// takes a SuperClass object as an argument 
		SuperClass scObject = new SuperClass();
		SuperClass acObject = new AnotherClass();
		SuperClass ncObject = new NewClass();

		// call the Monster.eatStuff method passing in all of the "different" class objects
		mObject.eatStuff(scObject);
		mObject.eatStuff(acObject);
		mObject.eatStuff(ncObject);
		
		// Note: Just how we passed in "different" class objects in as arguments, we can 
		// also return these different objects
		
	}
	
}



