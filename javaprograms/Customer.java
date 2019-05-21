/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author Admin
 */
public class Customer {
    private
            int pointsEarned, store;
            String name;
            long userId, phoneNumber, purchaseAmount;
    public
            Customer(long userId, String name, long phoneNumber, long purchaseAmount)
    {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.purchaseAmount = purchaseAmount; 
        this.pointsEarned = 0;
    }
    
    public void setPurchaseAmount(long purchaseAmount)
    {
        store = (int) purchaseAmount;
    }
 
    public void calculation()
    {
        if(store > 250)
          this.pointsEarned += (store / 10);
        
        this.purchaseAmount = this.purchaseAmount + store;
    }
    
    public String toString()
    {
        return userId +" "+ name + " "+pointsEarned + " " +purchaseAmount;
    }
            
    public static void main(String[] args) {
        Customer peter = new Customer(100001, "Peter", 98989898, 250);
        Customer ragu = new Customer(100002, "Ragu", 92929292, 250);
        Customer customerArray[] = new Customer[2];
        peter.setPurchaseAmount(5000);
        peter.calculation();
        customerArray[0] = peter;
        customerArray[1] = ragu;
        for(int i = 0 ; i < 2 ; i++)
        {
            System.out.println(customerArray[i]);
        }
    }
}
