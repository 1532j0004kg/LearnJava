/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Admin
 */

class MinorException extends Exception
{
    MinorException()
    {
        System.out.println("Minor account can't be accepted without the guardian signatire");
    }
}
public class CustomException {
    public static void main(String[] args) {
        int age = 17;
        try{
            if(age < 18)
                throw new MinorException();
        }
        catch(MinorException e)    
                {
                    System.out.println(e);
                }
    }
}
