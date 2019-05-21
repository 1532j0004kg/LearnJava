/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author Admin
 */
abstract class Pet {
    String name;
    Pet(String name){
        this.name = name;
    }
    public void wakeUp(){
        MakeSound();
    }
  
    abstract void MakeSound();
}

class Cat extends Pet{
    Cat(String c_name) {
        super(c_name);
    }

    public void MakeSound() {
        System.out.println(super.name+" the Cat says: Meow! Meow! ");
    } 
}

class Dog extends Pet{
    Dog(String c_name) {
        super(c_name);
    }

    public void MakeSound() {
        System.out.println(super.name+" the Dog says: Woof! Woof! ");
    } 
}

class Parrot extends Pet {
    Parrot(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.println(super.name+" the Parrot says: Hello! Hello! ");
    }   
    
}


