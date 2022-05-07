
package marketmanagementsystem;

import java.util.Scanner;


public class BuyerInfo  {
    
    
    private String name;
    private int phone_number;
    
    public void getBuyerInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Buyer's Name: ");
        name=input.nextLine();
        System.out.println("Enter Buyer's Phone Number: ");
        phone_number=input.nextInt();
    }
    
    public void displayBuyerInfo()
    {
        System.out.println("Buyer's Name: "+name);
        System.out.println("Buyer's Phone Number: "+phone_number);
    }
    
    public void checkCategory(Category category) {

        if (category.status.equals("Member"))
            System.out.println("He/She has a Member Card! ");
        else if (category.status.equals("NonMember")) 
            System.out.println("He/She has not a Member Card! ");
        else 
            System.out.println("");
    
    }
    
  
}
