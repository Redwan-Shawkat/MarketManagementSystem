
package marketmanagementsystem;

import java.util.Scanner;


public class LocalProductInfo extends ProductInfo implements IVat{
    
    private String local_product_name;
    private double local_product_price;
    
    
    public void displayLocalProductMenu(){
        System.out.println(":::Price List of Local Product:::");
        System.out.println("Perfume: 20.00 Taka");
        System.out.println("Lotion: 25.00 Taka");
        System.out.println("Cream: 30.00 Taka");
        System.out.println("Soap: 15.00 Taka");
        System.out.println("Toothpaste: 15.00 Taka");
        System.out.println("Toothbrush: 05.00 Taka");
    }
    
    public void getLocalProductInfo(){
        
        Scanner input = new Scanner (System.in);
        getProductInfo();
        System.out.println("Which Local Product You want to buy: ");
        local_product_name=input.nextLine(); 
        System.out.println("Enter the price of that Local product: ");
        local_product_price=input.nextDouble();
    }
    
    
    
    public void displayLocalProductInfo(){
        displayProductInfo();
        System.out.println("Local Product: "+local_product_name);
        System.out.println("Local Product Price: "+local_product_price);
    }
    
    
    
    
    
    @Override
    public void product_vat(){
        double local_product_price_with_vat = local_product_price+0.05;
        System.out.println("Product Price with Vat: "+local_product_price_with_vat);
    }
    
    
}
