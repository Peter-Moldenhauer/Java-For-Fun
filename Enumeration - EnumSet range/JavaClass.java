package myJavaProject;

// import enum set class
import java.util.EnumSet;  // allows you to use the built in range method 


public class JavaClass {
	public static void main(String args[]){
		
		// Enhanced for loop. 
		// "people" is what you want to call the objects when you loop through them
		// NewClass.values() is a built in array of the constants that are in the NewClass - built in array of: peter, rachel, travis
		
		// Used in last tutorial (enhanced for loop below) - prints out all of the constants 
		for(NewClass people: NewClass.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getAge());
	
		
		// print out a line to separate the above loop (old tutorial) from new material (below)
		System.out.println("\nAnd now for the range of constants...\n");
		
		
		// Enhanced for loop to go through the range instead of the entire thing
		// Now, instead of printing out the entire array of values (enum constants), we 
		// have a specific set in the array - all the constants from rachel to levi 
		for(NewClass people: EnumSet.range(NewClass.rachel, NewClass.levi))  // start at rachel and end at levi 
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getAge());
	}
	
	
}

/* Output... 
peter	nice	30
rachel	kind	26
travis	smart	27
anila	stern	25
levi	loud	23
tabitha	goofy	22

And now for the range of constants...

rachel	kind	26
travis	smart	27
anila	stern	25
levi	loud	23
*/
