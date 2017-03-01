/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
public class Python extends Snake implements PetInterface{

	String color;
	public Python(String snakeName, int snakeLength, String snakeColor){
		super(snakeName,snakeLength);
	color = snakeColor;	
	}
	public String getColor(){
		
		return color;
	}
	public String hunt(){
		return "It slithers around and catches a mouse"; 
	}
	public String toString(){
		return super.toString() + "color:" + color;
		
	}


}
