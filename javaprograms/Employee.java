/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;


/**
 *
 * @author Admin
 */
public class Employee {
    private
        String name, desig;    
        int empId, basicpay, allowance;
    public
        Employee(String name, String desig, int empId)
        {
            this.name = name;
            this.desig = desig;
            this.empId = empId;
            this.basicpay = 10000;
            this.allowance = 1000;
        }
    
        public String getName() {
            return name;
        }
        public int calculateNetPay()
        {
            return basicpay+allowance;
        }
               
}
class PartTimeEmployee extends Employee
{
    private
            int no_of_hrs_worked, wage_per_hr;
    public
            PartTimeEmployee(int no_of_hrs_worked, String name, String desig, int empId)
            {
                super(name, desig, empId);
                this.no_of_hrs_worked = no_of_hrs_worked;
                basicpay = 0;
                allowance = 0;
                this.wage_per_hr = 100;
            }
        public int calculateNetPay()
        {
            return no_of_hrs_worked*wage_per_hr;
        }

}
