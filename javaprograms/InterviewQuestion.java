/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author Admin
 */
class StringTest{
    String getLiteralString()
    {
        return "555";
    }
    void run()
    {
        System.out.println("555"=="555"+"");
        System.out.println(getLiteralString() == getLiteralString()+"");
      //  System.out.println(getLiteralString()  == getLiteralString()+"" );
    }
}
public class InterviewQuestion {
    public static void main(String[] args) {
        new StringTest().run();
        
        String name = "dinesh";
        System.out.println(name.hashCode());
        name = "dinesh" + "g";
        System.out.println(name.hashCode());
        String desig = new String("stud");
        String s = "test";
        String s1 = "test";
        System.out.println(s.hashCode()+" "+s1.hashCode());
        System.out.println(name.hashCode());
        String s2 = new String("test");
        System.out.println(s2==s1);
        
        String s12 = new String();
        String s21 = "";
        System.out.println(s12.equals(s21));
    }
}
