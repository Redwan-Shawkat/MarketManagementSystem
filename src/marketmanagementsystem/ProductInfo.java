
package marketmanagementsystem;

import java.util.Scanner;


public class ProductInfo {
    
    private int product_id;
    
    
    public void getProductInfo(){
            Scanner input = new Scanner (System.in);
            System.out.println("Enter Product ID: ");
            product_id=input.nextInt();
        }
    
    public void displayProductInfo(){
        System.out.println("Product ID: "+product_id);
    }
    
        
        public void checkLocation(Location location) {

        if (location.status.equals("Local"))
            System.out.println("This is a local product! ");
        else if (location.status.equals("Foreign")) 
            System.out.println("This is an imported product! ");
        else 
            System.out.println("");
        
    }
    
    }
