package myJavaProject;


// private vs. public variables in classes
// public - any class can use that variable 
// private - only the methods inside of the given class can use the variable 

public class NewClass {

	private String favoriteFood;  
	
	public void setFood(String food){  //return type is void
		favoriteFood = food;
	}
	
	public String getFavoriteFood(){  // return type is String
		return favoriteFood; 
	}
	
	public void outputText(){
		System.out.printf("Your favorite food is %s", getFavoriteFood());
	}
}
