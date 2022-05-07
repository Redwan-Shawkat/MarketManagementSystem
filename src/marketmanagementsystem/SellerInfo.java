
package marketmanagementsystem;

import java.util.Scanner;


public class SellerInfo  {
    
    protected String name;
    private int id;
    
    
    public void getSellerInfo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Seller's Name: ");
        name=input.nextLine();
        System.out.println("Enter Seller's ID: ");
        id=input.nextInt();
        
    }
    
    public void displaySellerInfo(){
        System.out.println("Seller's Name: "+name);
        System.out.println("Seller's ID: "+id);
       
    }
    
    
    public void checkCategory(Category category) {

        if (category.status.equals("FullTimer"))
            System.out.println("He/She is a FullTime Seller! ");
        else if (category.status.equals("PartTimer")) 
            System.out.println("He/She is a PartTime Seller! ");
        else 
            System.out.println("");
    
    }
}
