package myJavaProject;

// To use Enum's, instead of public class NewClass, do public enum NewClass...

public enum NewClass {

	// Each of these constants are in essence, objects
	peter("nice", "30"),
	rachel("kind", "26"),
	travis("smart", "27");
	
	// Each of the above objects have a set of their own variables, one for description and one for year
	private final String desc;
	private final String year;
	
	// Create an enumeration constructor 
	NewClass(String description, String age){
		desc = description;
		year = age;
	}
	
	public String getDescription(){
		return desc;
	}
	
	public String getAge(){
		return year;
	}
}
