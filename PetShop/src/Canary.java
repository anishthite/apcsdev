/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
import java.util.Scanner;
public class Canary extends Bird implements PetInterface{
	private Scanner reader = new Scanner(System.in);
	private String color;
	private String canSing;
	public Canary(String birdName, String birdGender, String squackType, String canaryColor, String canItSing ){
		
		super(birdName, birdGender, squackType);
		canSing = canItSing.toLowerCase();
		color = canaryColor;
		
	}
	public String getColor(){
		
		return color;
		
	} 
	public String sing(){
		if (canSing == "yes")
		return "Twee, Twee too...";
		else
		return "Sorry, this bird cannot sing!";
	}
	public String toString(){
		
		return super.toString() + "color = " + color + "Can it sing?" + canSing; 
	}
	
	
	
}
