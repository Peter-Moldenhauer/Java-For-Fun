package myJavaProject;

// Build a basic calculator 

import java.util.Scanner; 

public class JavaClass {
	public static void main(String args[]){
		 
		// make a scanner variable
		Scanner myVar = new Scanner(System.in);  
		
		int var1 = 5;
		int var2 = 10;
		int var3 = 20;
		
		//pre-increment increments the value before it uses it
		System.out.println(++var1); // this will print 6
		
		//post-increment will use the value and then increment it afterwards
		System.out.println(var2++);  // this will print 10, but after this line then var2 will equal 11 
		System.out.println(var2);    // this prints 11 now
		
		// assignment operator will add original value to the variable plus the additional number
		var3 += 5; // this is the same as 20 + 5
		System.out.println(var3); // this will print 25
	}
}

