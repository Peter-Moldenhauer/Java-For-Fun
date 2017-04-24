package myJavaProject;

// "Final" Variable Type
// Whenever you type "final" in front of a variable/constant it means you 
// cannot modify it no matter what 

public class JavaClass {
	public static void main(String args[]){
		
		NewClass object1 = new NewClass(10);
		
		for(int i = 0; i < 5; i++){
			object1.add();
			System.out.printf("%s", object1); 
		}
	}
	
	
}
 /* Output... 
Sum = 10
Sum = 20
Sum = 30
Sum = 40
Sum = 50
*/