package myJavaProject;

import javax.swing.JFrame;

public class JavaClass {
	public static void main(String args[]){
		
		// create a new object
		NewClass myObject = new NewClass(); 
		
		myObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //whenever you hit x, exit the program
		
		// set size of window
		myObject.setSize(350, 100);
		
		// set visibility
		myObject.setVisible(true);

	}
	
}

