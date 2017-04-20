package myJavaProject;

 // A switch statement tests one variable and depending on the value 
// of that variable, it gives you multiple choices 

public class JavaClass {
	public static void main(String args[]){
		 
		int age;
		age = 3;
		
		switch (age){
		case 1: 
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("You are older than 3");
			break;
		}
		
	}
}

