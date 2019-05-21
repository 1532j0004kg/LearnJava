/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverloading;

/**
 *
 * @author Admin
 */
abstract class Square
{
    private
           int length;
    public 
            Square(int side)
    {
        this.length = side;
    }
            final public int getLength()
            {
                return length;
            }
          
}
class Rectangle extends Square{
    private   
       int breadth, area;
    public
        Rectangle(int length, int breadth)
        {
               super(length);
               this.breadth = breadth;
        }
    /* public int getLength()
    {
        return this.length;
    }*/
    int area()
    {
        return area;
    }
}
