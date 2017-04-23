package myJavaProject;

// Other array stuff... 

public class JavaClass {
	public static void main(String args[]){
		
		// Summing elements of arrays example...
		
		int myArray[]={1,2,3,4,5};
		int sum = 0;
		
		for(int i = 0; i < myArray.length; i++){
			sum += myArray[i];
		}
		
		System.out.println("Total sum of array: " + sum);
	}
}

