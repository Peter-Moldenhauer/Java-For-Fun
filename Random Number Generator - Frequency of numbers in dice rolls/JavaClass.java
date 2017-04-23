package myJavaProject;

// Array elements as counters
// This program shows the frequency of numbers of a dice roll

import java.util.Random;  // import random number generator 

public class JavaClass {
	public static void main(String args[]){
		
		Random ranObj = new Random();  // create object of random generator 
		
		int freq[] = new int[7];  // make an array named freq and set it equal to 7 elements in that array
		
		// for 1000 rolls of a dice, any time a number 1 through 6 is rolled, it took that 
		// index (index of 1 through 6) and incremented its cound in the freq array
		for(int roll = 1; roll < 1000; roll++){
			++freq[1+ranObj.nextInt(6)];
		}
		
		// Make a header for the output of the data
		System.out.println("Number\tFrequency");
		
		// print out the frequencies of each die roll from the freq array...
		for(int number = 1; number < freq.length; number++){
			System.out.println(number + "\t" + freq[number]);
		}
	}
}

/* Example output:
Number	Frequency
1	168
2	163
3	168
4	177
5	161
6	162
*/