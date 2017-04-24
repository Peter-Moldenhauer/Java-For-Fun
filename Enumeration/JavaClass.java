package myJavaProject;

// Enumeration aka Enum 
// Enums are like classes but you will use them to declare constants


public class JavaClass {
	public static void main(String args[]){
		
		// Enhanced for loop. 
		// "people" is what you want to call the objects when you loop through them
		// NewClass.values() is a built in array of the constants that are in the NewClass - built in array of: peter, rachel, travis
		
		for(NewClass people: NewClass.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getAge());
		
	}
	
	
}

/* Output...
peter	nice	30
rachel	kind	26
travis	smart	27
*/