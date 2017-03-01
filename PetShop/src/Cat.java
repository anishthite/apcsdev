/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
public class Cat extends AbstrPets implements PetInterface{
	private int age;
	private String type;
	public Cat(String catName, int catAge, String catType){ //type = indoor or outdoor cat
		super(catName);
		age = catAge;
		type = catType;
		
	}
	public String speak(){
		return "Meow!";
		
	}
	public String move(){
		return "stalk";
		
	}
	public String cough_hairball(){
		
		return "Gak...Gak... GAK.. meow!";
		
	}
	public int getAge(){
		
		return age;
	}
	public String getType(){
	
		return type;
	}
	public String toString(){
		
		
		return super.toString() + "age: " + age + "type: " + type; 
	}
	

	
	
	
}


