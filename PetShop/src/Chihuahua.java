public class Chihuahua extends Dog implements PetInterface  // concrete classes as well as
                                    // abstract classes can be extended by 
                                    // another class
{
  private String whereFrom;
  
  public Chihuahua (String dogName, int weight, int age)
  {
    super (dogName,weight, age);
  }
  
  public void setPlace(String location)
  {
    whereFrom = location;
  }
  
  public String speak()  // overwrites speak in Dog
  {
    return "chalupa!!";
  } 
  
  public String move()  // overwrites move in Dog
  {
    return  "little tiny steps";
  }
  
  public String cityOfOrigin()
  {
    return whereFrom;
  }  
  
}