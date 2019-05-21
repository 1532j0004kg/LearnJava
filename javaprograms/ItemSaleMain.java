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
public class ItemSaleMain {
        public static void main(String[] args) {
        int totalStockValue = 0;
        ArrayList<ItemSale> arrayOfObjects = new ArrayList<ItemSale>();
        ItemSale bat = new ItemSale(1, "bat", 10, 500);
        arrayOfObjects.add(bat);
        ItemSale ball = new ItemSale(2, "ball", 15, 10);
        arrayOfObjects.add(ball);
        ItemSale stump = new ItemSale(3, "stump", 120, 70);
        arrayOfObjects.add(stump);      
        ItemSale pad = new ItemSale(4, "pad", 10, 300);
        arrayOfObjects.add(pad);
        ItemSale byles = new ItemSale(5, "byles", 60, 50);
        arrayOfObjects.add(byles);
        ItemSale bat2 = new ItemSale(6, "bat2", 20, 1000);
        arrayOfObjects.add(bat);
            ItemSale bat3 = new ItemSale(bat2); 
         //   System.out.println("bat 3 hashcode " + bat3.hashCode());
        for(int i = 0 ; i < arrayOfObjects.size() ; i++)    
        {
            totalStockValue += arrayOfObjects.get(i).calculateItemValue();
            System.out.println(arrayOfObjects.get(i) + "... Total value : "+ arrayOfObjects.get(i).calculateItemValue());
        }
        
        System.out.println("Total Stock value : " + totalStockValue);
    }
}
