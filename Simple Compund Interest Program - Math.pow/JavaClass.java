package myJavaProject;

// Simple compund interest program
// compound interest equation: A=P(1+R)^n 

// A = amount, P = principal, R = rate, n = number of years

public class JavaClass {
	public static void main(String args[]){
		
		double amount;    // this is what we want to find 
		double principal = 10000;  // starting number of subscribers
		double rate = .01;  // gaining 1% of subscribers a day 
		
		for(int year = 1; year<=20; year++){  // give me information from year 1 to year 20
			amount = principal *Math.pow(1 + rate, year);
			System.out.println("Year: " + year + " - Amount: " + amount);
		}
	}
}

