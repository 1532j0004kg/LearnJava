/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class PetMain{
    public static void main(String[] args){
    Dog a_dog;
    Cat a_cat;
    Parrot a_parrot;
    Pet a_pet;
    
    //Uncomment this lines 
    
    //a_pet = new Pet("Frankie");
    //a_pet.wakeUp();
    
    a_cat = new Cat("Kitty");
    a_cat.wakeUp();
    
    a_dog = new Dog("Doggie");
    a_dog.wakeUp();
    
    a_parrot = new Parrot("Polly");
    a_parrot.wakeUp();
    
    ArrayList<Pet> pets = new ArrayList<Pet>();
    pets.add(a_parrot);
    pets.add(a_cat);
    pets.add(a_dog);
   
    System.out.println(pets.size());
        for (int i = 0; i < pets.size(); i++) {
            pets.get(i).MakeSound();
        }
    }    
}
