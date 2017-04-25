package myJavaProject;


// GUI with JFrame
// Making the GUI output look like the typical OS-specific interface (Windows vs. Mac feel)

import javax.swing.JFrame;  // gives all the basic windows features 


public class JavaClass {
	public static void main(String args[]){
		
		// build an object for the NewClass class
		NewClass myObject = new NewClass();
		
		// This is for whenever you click the x button then the program terminates
		myObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set a size for the object/window 
		myObject.setSize(275, 180);
		
		// This is for so you can see it
		myObject.setVisible(true);
	}
	
}

