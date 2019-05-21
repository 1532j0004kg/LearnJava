/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class CheckedException {
     
    public static void main(String[] args) throws FileNotFoundException {
         FileReader filepath = new FileReader("C:\\Users\\Admin\\Desktop\\JavaPractice\\src\\arrays\\1.txt");

        BufferedReader br = null;
        String curline;
        try {
            br = new BufferedReader(filepath);
 
            while ((curline = br.readLine()) != null) {
                System.out.println(curline);
            }
 
        } catch (IOException e) {
         
            System.err.println("An IOException was caught :"+e.getMessage());
         
        }finally{
             
            try {
                 
                if(br != null)
                    br.close();
             
            } catch (IOException e) {
                 
                e.printStackTrace();
            }
        }
 
    }
 
}
