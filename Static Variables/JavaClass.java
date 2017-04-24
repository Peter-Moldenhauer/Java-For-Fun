package myJavaProject;

// Static variables and how they are used
// Allows for all of the objects to share a single variable 


public class JavaClass {
	public static void main(String args[]){
		
		NewClass member1 = new NewClass("Peter", "Moldenhauer");
		NewClass member2 = new NewClass("Rachel", "Urban");
		NewClass member3 = new NewClass("Travis", "Eliasun");
	}
	
	
}

/* Output... 
Constructor for Peter Moldenhauer, number of group members: 1
Constructor for Rachel Urban, number of group members: 2
Constructor for Travis Eliasun, number of group members: 3
*/