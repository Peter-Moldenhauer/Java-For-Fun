package myJavaProject;

// Static variables allows all of the objects to share a single variable 

public class NewClass {

	private String firstName;
	private String lastName;
	private static int groupMembers = 0;  // static means that every object will share this variable - so when it changes, it changes for ALL objects 
	
	// constructor - how we will enter people in our group 
	public NewClass(String fn, String ln){
		firstName = fn;
		lastName = ln;
		groupMembers++;  // each time we add a group member, the groupMember variable increments
		System.out.printf("Constructor for %s %s, number of group members: %d\n", firstName, lastName, groupMembers);
	}
}
