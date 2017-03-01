/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
public class Siamese extends Cat implements PetInterface{
	private String declawed;
	public Siamese (String catName, int catAge, String catType, String isDeclawed){
		
		super(catName,catAge,catType);
		declawed = isDeclawed.toLowerCase();
		
	}
	public String getDeclawed(){
		if (declawed == "yes")
			return "It has been declawed" ;
		else 
			return "It has not been declawed";
	}
	public String speak(){
		
		return "Purrrr";
	}
	public String drink_milk(){
		
		return "sip...sip";
	}
	public String toString(){
		
		return super.toString() + getDeclawed();
	}
}
