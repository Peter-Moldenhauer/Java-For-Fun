package myJavaProject;

public class AnotherClass {
	
	private int month;
	private int day;
	private int year; 
	
	// constructor
	public AnotherClass(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		// print out a string
		System.out.printf("The constructor for this is %s\n", this);  // "this" refers to the current object
		// So, instead of a string variable to be put into %s it is a reference to an object,
		// and anytime you reference an object and you need it in the string format, it looks 
		// to the toString method. 
	}
	
	// Anytime you need a string representation of an object, use the toString method
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
	
}
