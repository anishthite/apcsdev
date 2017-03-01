/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
import java.util.Scanner;
public class Parrot extends Bird implements PetInterface{
	private Scanner reader = new Scanner(System.in);
	private String color;
	public Parrot(String birdName, String birdGender, String squackType, String parrotColor ){
		
		super(birdName, birdGender, squackType);
		color = parrotColor;
		
	}
	public String getColor(){
		
		return color;
		
	} 
	public void talk_back(){
		System.out.println("Enter text for your parrot to talk back");
		System.out.println(reader.nextLine() + "... SQUACK");
		
	}
	public String toString(){
		
		return super.toString() + "color = " + color; 
	}
	
	
	
}
