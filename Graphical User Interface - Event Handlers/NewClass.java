package myJavaProject;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane; 

public class NewClass extends JFrame{

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	// create constructor - whatever you create in this is pretty much the window
	public NewClass(){
		// title to the window
		super("The Title");
		
		// layout to the window
		setLayout(new FlowLayout());
		
		// add text fields to window 
		item1 = new JTextField(10);
		add(item1);
		item2 = new JTextField("Enter text here");
		add(item2);
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3); 
		
		// add password field to window
		passwordField = new JPasswordField("mypass"); // mypass will show up as astriks on screen
		add(passwordField); 
		
		// build an action listener object
		theHandler handler = new theHandler(); 
		
		// add this object to each of the items...this gives functionality to each of the items
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
				
	}
	
	// build a new class inside the NewClass class because when its inside then it 
	// inherits all of the stuff from the outside class
	
	// this is the class that handles the events 
	private class theHandler implements ActionListener{
		
		// this method is called automatically whenever an event occurs
		public void actionPerformed(ActionEvent event){
			
			String string = "";
			
			// reassign/change the string variable 
			if(event.getSource() == item1)
				string = String.format("Field 1: %s", event.getActionCommand()); 
			else if(event.getSource() == item2)
				string = String.format("Field 2: %s", event.getActionCommand());
			else if(event.getSource() == item3)
				string = String.format("Field 3: %s", event.getActionCommand());
			else if(event.getSource() == passwordField)
				string = String.format("Password field is: %s", event.getActionCommand()); 
			
			// output to the screen
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
}

/* Notes:
In order to handle events in Java, you need an event handling class (theHandler).
This class needs to implement ActionListener.  
*/ 