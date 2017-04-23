package myJavaProject;


public class NewClass {

	private int hour;
	private int minute;
	private int second; 
	
	// CONSTRUCTORS...
	
	public NewClass(){  // constructor with 0 arguments 
		this(0,0,0);
	}
	
	public NewClass(int h){   // constructor with 1 argument 
		this(h,0,0);
	}
	
	public NewClass(int h, int m){  // constructor with 2 arguments
		this(h,m,0); 
	}
	
	public NewClass(int h, int m, int s){   // constructor with 3 arguments 
		setTime(h,m,s);
	}
	
	// SET METHODS...
	
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s); 
	}
	
	public void setHour(int h){
		// check to make sure that data is between 0 and 24
		hour = ((h>=0 && h<24) ? h : 0);  // conditional expression, same as an if-statement
	}
	
	public void setMinute(int m){
		// check to make sure that data is between 0 and 60
		minute = ((m>=0 && m<60) ? m : 0);  
	}
	
	public void setSecond(int s){
		// check to make sure that data is between 0 and 60
		second = ((s>=0 && s<60) ? s : 0);  
	}
	
	// GET METHODS...
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second; 
	}
	
	// Return Data...
	
	public String toMilitaryTime(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
