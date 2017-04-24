package myJavaProject;


public class NewClass {

	private String name;
	
	// reference to the AnotherClass class - create an object of this class named birthday
	private AnotherClass birthday;
	
	// built a constructor
	public NewClass(String myName, AnotherClass myDate){
		name = myName;
		birthday = myDate;
	}
	
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
