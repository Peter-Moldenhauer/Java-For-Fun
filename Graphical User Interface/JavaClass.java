package myJavaProject;

// To use the Graphical User Interface, need to import the class...
import javax.swing.JOptionPane;

public class JavaClass {
	public static void main(String args[]){
		
		// display input box to let user enter data 
		String firstNum = JOptionPane.showInputDialog("Enter first number"); 
		String secondNum = JOptionPane.showInputDialog("Enter second number");
		
		// convert string variables to ints (because showInputDialog only accepts strings) 
		int num1 = Integer.parseInt(firstNum);  // take string from firstNum variable and turn to int and store int in num1 variable 
		int num2 = Integer.parseInt(secondNum); 
		
		int sum = num1 + num2; 
		
		// display message box with the sum in it
		// null means put box in center of the screen
		// next arg is what text you want in message box
		// third arg is what you want in the title bar of the box
		// fourth arg is the message that will pop up 
		JOptionPane.showMessageDialog(null, "The sum is: " + sum, "The title", JOptionPane.PLAIN_MESSAGE);
	}
	
}

