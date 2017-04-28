package myJavaProject;



public class Monster {

	// pass in a SuperClass object
	// Note: any time you pass in a SuperClass object, you can also pass in objects of its subclass (NewClass, AnotherClass)
	public void eatStuff(SuperClass x){
		// call eat() method of the object passed in...
		x.eat();
	}
	
}
