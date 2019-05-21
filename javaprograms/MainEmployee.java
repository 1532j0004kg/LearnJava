/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author Admin
 */
public class MainEmployee {
    public static void main(String[] args) {
        
        // Understanding the us of super class check the employee.java
        Employee dudud = new Employee("dudud", "developer", 1);
        PartTimeEmployee dud = new PartTimeEmployee(20, "dudud", "developer", 1);
        int FSalary = dud.calculateNetPay();
        int PSalary = dudud.calculateNetPay();
        System.out.println("Full Time worker salary : " +FSalary+"\nPart Time worker salary : " + PSalary);
      //  System.out.println(dud.getName() + " " + dud.hashCode());
        
        // System.out.println(dud.hashCode()+"'s object value : "+dud);
    }
}
