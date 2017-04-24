package myJavaProject;



public class NewClass {

	private int sum;
	private final int NUMBER; // once you set this equal to something, it cannot be changed 
	
	// constructor 
	public NewClass(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum+=NUMBER;
	}
	
	public String toString(){
		return String.format("Sum = %d\n", sum);
	}
}
