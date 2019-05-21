/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;
/**
 *
 * @author Admin
 */
public class ItemSale {
    private
            int number, quantity, price, total = 0;
            String name;
    public
            
                  ItemSale(int number, String name)
    {
        this.name = name;
        this.number = number;
    }
    
    // constructor chaining
            ItemSale(int number, String name, int quantity, int price)
    {
        this(number, name);
        this.quantity = quantity;
        this.price = price;
    }
    
    //copy constructor
    ItemSale(ItemSale is)
    {
        name = is.name;
        number = is.number;
        quantity = is.quantity;
        price = is.price;
    }
 
    public int calculation()
    {
        this.total = this.quantity * this.price;
        return this.total;
    }
    
    public int calculateItemValue()
    {
        return quantity * price;
    }
    
    @Override
    public String toString()
    {
      return number + " " + name + " " + quantity + " " + price;  
    }
}
