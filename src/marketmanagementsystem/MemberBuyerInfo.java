
package marketmanagementsystem;

import java.util.Scanner;



public class MemberBuyerInfo extends BuyerInfo implements IBonus{
    
    
    
    
     private int id;
     private int age;
     private String gender;
     
     
     public void getMemberBuyerInfo(){
         Scanner input = new Scanner (System.in);
         getBuyerInfo();
         System.out.println("Enter Membership ID: ");
         id=input.nextInt();
         System.out.println("Enter Member's Age: ");
         age=input.nextInt();
         System.out.println("Enter Member's Gender: ");
         gender=input.nextLine();
         
     }
     
     public void displayMemberBuyerInfo(){
         displayBuyerInfo();
         System.out.println("Membership ID: "+id);
         System.out.println("Member's Gender: "+gender);
         System.out.println("Member's Age: "+age);
         
     }
             

    
    @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus 8%");
        
    }
    
    
    
    @Override
    public void puja_bonus(){
        System.out.println("Puja Bonus 4%");
        
    }
    
    
    
    public void checkPrice1o1(double local_product_price_with_vat){
               System.out.println("Eid Bonus for Local Product (Member Buyer): 8%");
    }
    
    public void checkPrice2o1(double foreign_product_price_with_vat){
        System.out.println("Eid Bonus for Foreign Product (Member Buyer): 8%");
    }
    
    public void checkPrice3o1(double local_product_price_with_vat){
        System.out.println("Puja Bonus for Local Product (Member Buyer): 8%");
    }
    
     public void checkPrice4o1(double foreign_bonus_price_with_vat){
        System.out.println("Puja Bonus for Local Product (Member Buyer): 8%");
    }
            
    
}
