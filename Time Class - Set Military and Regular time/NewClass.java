package myJavaProject;


public class NewClass {

	private int hour;
	private int minute;
	private int second; 
	
	// Create a method to allow the user to input numbers (for the hours, mins and secs) 
	public void setTime(int h, int m, int s){
		hour = ((h>=0 && h<24) ? h : 0);  // hour = h if h>=0 and h<24, otherwise hour = 0
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	}
	
	
	// create method to display in military time
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second);  // 02 means to display in 2 decimal places
	}
	
	
	// create mehtod to display in regular time 
	public String toRegular(){
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12 ? "AM":"PM"));
	}
}
