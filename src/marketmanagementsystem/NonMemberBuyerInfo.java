
package marketmanagementsystem;

import java.util.Scanner;


public class NonMemberBuyerInfo extends BuyerInfo implements IBonus {
    
     
    
    private String delivery_location;
    private String date;
    
     
     public void getNonMemberBuyerInfo(){
         Scanner input = new Scanner (System.in);
         getBuyerInfo();
         System.out.println("Enter the Delivery Location:  ");
         delivery_location=input.nextLine();
         System.out.println("Date: ");
         date=input.nextLine();
     }
     
     public void displayNonMemberBuyerInfo(){
         displayBuyerInfo();
         System.out.println("Delivary Location: "+delivery_location);
         System.out.println("date: "+date);
         
     }     
     
    @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus: 1%");
    }
    
    @Override
    public void puja_bonus(){
        System.out.println("Puja Bonus: 1%");
    }
    
     
   public void checkPrice1o1(double local_product_price_with_vat){
               System.out.println("Eid Bonus for Local Product (Member Buyer): 1%");
    }
    
    public void checkPrice2o2(double foreign_product_price_with_vat){
        System.out.println("Eid Bonus for Foreign Product (Member Buyer): 1%");
    }
    
    public void checkPrice3o3 (double local_product_price_with_vat){
        System.out.println("Puja Bonus for Local Product (Member Buyer): 1%");
    }
    
    public void checkPrice4o4 (double foreign_bonus_price_with_vat){
        System.out.println("Puja Bonus for Local Product (Member Buyer): 1%");
    }
        
}
