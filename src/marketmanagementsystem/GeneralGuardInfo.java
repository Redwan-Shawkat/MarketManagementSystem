
package marketmanagementsystem;

import java.util.Scanner;


public class GeneralGuardInfo extends GuardInfo implements IBonus {
    
     private int id;
    private String age;
    private double daily_fee=1000;
    private double monthly_fee;
    private int phone_number;
    
    public void getGeneralGuardInfo(){
        getGuardInfo();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter General Guard's ID: ");
        id=input.nextInt();
        System.out.println("Enter General Guest's Age: ");
        age=input.nextLine();
        System.out.println("Enter General Guest's Phone Number: ");
        phone_number=input.nextInt();
    }
    
    public void displayGeneralGuardInfo(){
        displayGuardInfo();
        System.out.println("General Guest's ID: "+id);
        System.out.println("General Guest Age: "+age);
        System.out.println("Phone Number of General Guest: "+phone_number);
    }
    
    public void calculateGeneralGuardMonthlySalary(){
        monthly_fee=daily_fee*12;
        System.out.println("Monthly Salary of General Guard: "+monthly_fee);
    }
    
    @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus of General Guard: "+monthly_fee*0.05);
    }
    
    @Override
    public void puja_bonus(){
            System.out.println("Puja Bonus of General Guard: "+monthly_fee*0.05);
    }
    
    
}
