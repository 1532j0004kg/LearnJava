/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Animal[] petAnimals = new Animal[2]; 
       // Animal base = new Animal();
        Dog snow = new Dog();
        System.out.println(snow.getNoOfLegs());
        Horse milky = new Horse();
        petAnimals[0] = milky;
        petAnimals[1] = snow;
        for(int i = 0 ; i < 2 ; i++)
        {
            System.out.println(petAnimals[i]);
            
        }
    }
}
