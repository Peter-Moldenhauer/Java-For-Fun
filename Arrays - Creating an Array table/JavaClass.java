package myJavaProject;

// Creating an Array Table 

public class JavaClass {
	public static void main(String args[]){
		
		// Table Header labels
		System.out.println("Index\tValue");
		
		// Create array
		int myArray[] = {2,4,6,8,10,12,14,16};
		
		// Use for loop to loop through elements to print out index and value of each
		for(int i=0; i<myArray.length; i++){
			System.out.println(i + "\t" + myArray[i]);
		}
		
	}
}

