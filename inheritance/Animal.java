/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Admin
 */
abstract public class Animal {
    protected
            int no_of_legs = 4;
    public
        Animal()
        {
            System.out.println("I am an Animal");
        }
    String move()
    {
       return "I can move";
    }
    int getNoOfLegs()
    {
        return no_of_legs;
    }
    abstract String makeSound();
}

class Dog extends Animal{
  private 
         int sniffingLevel = 1;
  public
         Dog()
        {
            System.out.println("I am a Dog");
        }
  int getSinffingLevel()
  {
      return sniffingLevel;
  }
  @Override
  String makeSound(){
      return "I can bark";
  }
  @Override
  public String toString()
  {
      return "I am a dog from toString()";
  } 
}

class Horse extends Animal{
  private 
         String speed = "100 km/hr";
  public
         Horse()
        {
            System.out.println("I am a Horse");
        }
  String getSpeed()
  {
      return speed;
  }
  @Override
  String makeSound(){
      return "I can neigh";
  }
  @Override
  public String toString()
  {
      return "I am a horse from toString()";
  } 
}