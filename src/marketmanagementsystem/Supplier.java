
package marketmanagementsystem;

import java.util.Scanner;


public class Supplier {
    
   private String name;
   private String adress;
   private String region;
   private int phone_number;
    
   public void getSupplierInfo(){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Supplier's Name: ");
        name=input.nextLine();
        System.out.println("Enter Supplier's Adress: ");
        adress=input.nextLine();
        System.out.println("Enter Supplier's Region ");
        System.out.println("Inside Dhaka (Y/N): ");
        region=input.nextLine();
        System.out.println("Enter Supplier's Phone Number: ");
        phone_number=input.nextInt();
    }
    
    public void displaySupplierInfo(){
        System.out.println("Supplier's Name: "+name);
        System.out.println("Supplier's Adree: "+adress);
        System.out.println("Region (Dhaka): "+region);
        System.out.println("Supplier's Phone Number: "+phone_number);
    }
    
   
    
     public void checkCategory(Category category) {

        if (category.status.equals("Local"))
            System.out.println("He/She supplies products inside Dhaka City! ");
        else if (category.status.equals("Abroad")) 
            System.out.println("He/She supplies products outside Dhaka City! ");
        else 
            System.out.println("");

     }
}     
     
