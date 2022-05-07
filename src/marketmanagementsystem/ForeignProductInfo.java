
package marketmanagementsystem;

import java.util.Scanner;

public class ForeignProductInfo  extends ProductInfo implements IVat  {
    
    private  String foreign_product_name;
   private  double foreign_product_price;
    
    public void displayForeignProductMenu(){
        System.out.println(":::Price List of Foreign Product:::");
        System.out.println("Perfume: 80.00 Taka");
        System.out.println("Lotion: 75.00 Taka");
        System.out.println("Cream: 90.00 Taka");
        System.out.println("Soap: 55.00 Taka");
        System.out.println("Toothpaste: 30.00 Taka");
        System.out.println("Toothbrush: 15.00 Taka");
    }
    
    public void getForeignProductInfo(){
        
        Scanner input = new Scanner (System.in);
        getProductInfo();
        System.out.println("Which Foreign Product You want to buy: ");
        foreign_product_name=input.nextLine(); 
        System.out.println("Enter the price of that Foreign product: ");
        foreign_product_price=input.nextDouble();
    }
    
    
    
    public void displayForeignProductInfo(){
        displayProductInfo();
        System.out.println("Local Product: "+foreign_product_name);
        System.out.println("Local Product Price: "+foreign_product_price);
    }
    
    
    
   
    
    @Override
    public void product_vat(){
        double foreign_product_price_with_vat = foreign_product_price+0.1;
        System.out.println("Product Price with Vat: "+foreign_product_price_with_vat);
    }
}
