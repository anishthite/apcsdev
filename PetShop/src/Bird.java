/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
public class Bird  extends AbstrPets{
	
	String gender, sound;
	public Bird(String birdName, String birdGender, String squackType){
	
	super(birdName);
	gender = birdGender.toLowerCase();
	sound = squackType;
	}
	public String getGender(){
		
		return gender;
	}
	public String move(){
		
		return "flap flap";
	}
	public String speak(){
		
		return sound;
	}
	public String lay_egg(){
		if (gender == "female"){
			return "an egg is lain";
		}
		else{
			return "Sorry! You bird cannot lay eggs.";
		}
		
	}
	public String toString(){
		
		return super.toString() + "gender: " + "gender";
	}
	
	
	
	
	
}
