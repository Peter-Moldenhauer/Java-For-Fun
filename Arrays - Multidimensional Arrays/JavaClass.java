package myJavaProject;

// Multidimensional arrays 

public class JavaClass {
	public static void main(String args[]){
		
		// Note the first [] is for row and second [] is for column
		int multArray[][] = {{8,9,10,11}, {55,56,57,58}}; // 1st row: 8 9 10 11, 2nd row: 55,56,57,58
		
		// 1st row: 1 2 3 4, 2nd row: 67; 3rd row: 55 56 57
		int multArray2[][]={{1,2,3,4}, {67}, {55,56,57}};
		
		System.out.println("This is the 1st 2D-array:");
		printArray(multArray);
		
		System.out.println();
		
		System.out.println("This is the 2nd 2D-array:");
		printArray(multArray2);
	}
	
	
	
	
	
	// create a method outside of main to print a table for a multi-array
	// Will need 2 loops - 1 to loop through columns, another to loop through rows 
	// The column loop will be inside of the row loop
	public static void printArray(int x[][]){
		for(int row = 0; row < x.length; row++){
			for(int column = 0; column < x[row].length; column++){
				System.out.print(x[row][column] + "\t"); // use print not println because we dont want a new line after each number
			}
		System.out.println();
		}
	}
	
}


/* Output:

This is the 1st 2D-array:
8	9	10	11	
55	56	57	58	

This is the 2nd 2D-array:
1	2	3	4	
67	
55	56	57	

*/

