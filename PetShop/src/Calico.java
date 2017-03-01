/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
public class Calico extends Cat implements PetInterface{
	private String color;
	public Calico (String catName, int catAge, String catType, String coatColor){
		
		super(catName,catAge,catType);
		color = coatColor;
		
	}
	public String getColor(){
		
		return color;
	}
	public String speak(){
		
		return "Rowr";
	}
	public String drink_milk(){
		
		return "slurp...slurp";
	}
	public String toString(){
		
		return super.toString() + "color:" + color;
	}
}
