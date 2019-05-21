/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Admin
 */
public class MainException {
    public static void throwMethod()
    {
           throw new ArithmeticException("Called from throw method");
    }
    
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5,6};
        int infinity = 10;
       try
       {
        //   System.out.println(numberArray[3]);
      //     System.out.println(infinity/0);
           throwMethod();
       }
       catch(ArrayIndexOutOfBoundsException exceptionObject)
               {
                   System.out.println("Array index exceeding");
              //     System.out.println(exceptionObject.getStackTrace());
               }
        catch(ArithmeticException e)
               {
                   System.out.println(e);
              //     System.out.println(exceptionObject.getStackTrace());
               }
       catch(Exception exceptionObject)
               {
                   System.out.println("Exception occured");
              //     System.out.println(exceptionObject.getStackTrace());
               }
       finally
       {
           System.out.println("Program worked fine!");
       }
    }
}
