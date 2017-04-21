package myJavaProject;

// the do-while loop executes the body statements before it even gets to the "while test condition"
// this means that at minimum, the loop body statements will execute at least once 

public class JavaClass {
	public static void main(String args[]){
		
		int counter = 0; 
		
		do{
			System.out.println("The counter variable is: " + counter);
			counter++; 
		}while(counter <= 10); 
		
	}
}

