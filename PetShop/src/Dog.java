// Dog IS A pet
// Dog extends AbstrPets by defining the abstract methods as concrete

public class Dog  extends  AbstrPets implements PetInterface
{
   private int weight;
   private int age;
   
   public Dog (String dogName, int dogWeight, int dogAge)
   {
    super (dogName);  //  invokes the concrete constructor in the 
                      // abstract class  AbstrPets
    weight = dogWeight;
    age = dogAge;
  }
  
  public int getWeight()
  {
    return weight;
  }
  public int getAge(){
	  
	return age;  
  }
  
  public String toString()  // the closest toString method to the object
                            // is in play.  If this toString was absent,
                            // the obejct would use the toString in super.
  {
    return (super.toString() + " is a dog, weighing " + weight + " pounds and is " + age + "years old" );
  }
  
  public String speak()  // defines abstract method speak for Dog
  {
    return "woof !!";
  } 
  
  public String move()  // defines abstract method  move  for Dog
  {
    return  "run";
  }
  
  
}