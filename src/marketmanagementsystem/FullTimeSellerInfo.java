
package marketmanagementsystem;

import java.util.Scanner;


public class FullTimeSellerInfo extends SellerInfo implements IBonus {
    
    private int working_hour;
    private double daily_salary=3000;
    private double monthly_salary;
    
    public void getFullTimeSellerInfo(){
        Scanner input = new Scanner(System.in);
        getSellerInfo();
        System.out.println("Enter Full Time Seller's Working Hour(s): ");
        working_hour=input.nextInt();
    }
    public void displayFullTimeSellerInfo(){
        displaySellerInfo();
        System.out.println("Full Time Seller's Working Hour(s): "+working_hour);
        System.out.println("Full Time Seller's Daily Salary: "+daily_salary);
    }
    
    public void calculateFullTImeSellerMontlySalary(){
        monthly_salary = daily_salary * 30;
        System.out.println("Full Time Seller's Monthly Salary: "+monthly_salary);
    }
    
    
    @Override
    public void eid_bonus()
    {
        System.out.println("Eid Bonus: "+monthly_salary*0.2);
    }
    
    @Override
    public void puja_bonus()
    {
        System.out.println("Puja Bonus: %"+monthly_salary*0.1);
    }
    
}
