package myJavaProject;

// Import files...
import java.awt.FlowLayout; // used for how things are placed - default layouts 
import javax.swing.JFrame;  // gives all the basic windows features (title bar, minimize/maximize, x to close) 
import javax.swing.JLabel;  // allows you to output text and images on the screen 

// use inheritance here...but for JFrame as the "Super Class"
public class NewClass extends JFrame{

	// build a variable for an item - the type is of "JLabel" 
	private JLabel item1;
	
	// build a constructor 
	public NewClass(){
		// first line in constructor is how you add a title to the window
		super("The title bar");
		
		// set the layout - pretty much the default layout
		setLayout(new FlowLayout()); 
		
		// build the actual item
		item1 = new JLabel("This is a sentence"); // how you put text on the screen 
		
		// add functionality to our item
		item1.setToolTipText("This is going to show up on hover"); // text will pop up when you hover over it
		
		// add the item to the window
		add(item1); 
	}
}


// Note: all of the methods such as "super()" and "setLayout()" were imported