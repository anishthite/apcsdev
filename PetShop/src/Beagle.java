/*
 Anish Thite
 2/20/2017
 Notre Dame High School
 */
public class Beagle extends Dog implements PetInterface  
{
  private String whereFrom;
  
  public Beagle (String dogName, int weight, int age)
  {
    super (dogName,weight, age);
  }
  
  public void setPlace(String location)
  {
    whereFrom = location;
  }
  
  public String speak() 
  {
    return "bark!!";
  } 
  
  public String move()  // overwrites move in Dog
  {
    return  "leaps and bounds";
  }
  
  public String cityOfOrigin()
  {
    return whereFrom;
  }  
  
}