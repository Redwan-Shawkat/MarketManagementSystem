
package marketmanagementsystem;

import java.util.Scanner;

public class CheifGuardInfo extends GuardInfo implements IBonus{
    
   private int id;
   private String age;
   private double daily_fee=2000;
   private double monthly_fee;
   private int phone_number;
    
   public void getCheifGuardInfo(){
       getGuardInfo();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Cheif Guard's ID: ");
        id=input.nextInt();
        System.out.println("Enter Cheif Guest's Age: ");
        age=input.nextLine();
        System.out.println("Enter Cheif Guest's Phone Number: ");
        phone_number=input.nextInt();
    }
    public void displayCheifGuardtInfo(){
        displayGuardInfo();
        System.out.println("Cheif Guest's ID: "+id);
        System.out.println("Cheif Guest Age: "+age);
        System.out.println("Phone Number of Cheif Guest: "+phone_number);
    }
    
    public void calculateCheifGuardtMonthlySalary(){
        monthly_fee=daily_fee*12;
        System.out.println("Monthly Salary of Cheif Guard: "+monthly_fee);
    }
    
    @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus of Cheif Guard: "+monthly_fee*0.05);
    }
    
    @Override
    public void puja_bonus(){
            System.out.println("Puja Bonus of Cheif Guard: "+monthly_fee*0.05);
    }
    
    
}
