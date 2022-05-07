
package marketmanagementsystem;

import java.util.Scanner;


public class PartTimeSellerInfo extends SellerInfo implements IBonus{
    
    private int working_hour;
    private String shift;
    private double daily_salary = 1000;
    private double monthly_salary;
    
    public void getPartTimeSellerInfo(){
        Scanner input= new Scanner (System.in);
        getSellerInfo();
        System.out.println("Enter Part Time Seller's Working Hour: ");
        working_hour=input.nextInt();
        System.out.println("Enter Part Time Seller's Shift(Day/Night): ");
        shift=input.nextLine();
    }
    
    public void displayPartTimeSellerInfo(){
        displaySellerInfo();
        System.out.println("Part Time Seller's Working Hour: "+working_hour);
        System.out.println("Part Time Seller's Shift: "+shift);
        System.out.println("Part Time Seller's Daily Salary: "+daily_salary);
    }
    public void calculateMonthlySalary(){
        monthly_salary=daily_salary*30;
        System.out.println("Part Time Seller's Monthly Salary: "+monthly_salary);
    }
    
   
    

    @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus: "+monthly_salary*0.1);
    }
    
    @Override
    public void puja_bonus(){
        System.out.println("Puja Bonus: "+monthly_salary*0.05);
    }
}
