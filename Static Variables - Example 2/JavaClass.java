package myJavaProject;

// Static variables and how they are used
// Allows for all of the objects to share a single variable 


public class JavaClass {
	public static void main(String args[]){
		
		NewClass member1 = new NewClass("Peter", "Moldenhauer");
		NewClass member2 = new NewClass("Rachel", "Urban");
		NewClass member3 = new NewClass("Travis", "Eliasun");
		
		// get the value of the static variable by just using the name of the class (NewClass)
		// This is different because usually, you need to create an object and then use that 
		// particular object with dot seperator to access methods of the class...but now because 
		// the groupMembers variable is static and common among all objects, you dont need to use 
		// an object to call it, just need the class name: NewClass.getMembers()
		// Note: you still CAN use an object to access the getMembers() function if you want to though
		System.out.println("Number of group members: " + NewClass.getMembers());
	}
	
	
}

/* Output... 
Constructor for Peter Moldenhauer, number of group members: 1
Constructor for Rachel Urban, number of group members: 2
Constructor for Travis Eliasun, number of group members: 3
Number of group members: 3
*/