
package marketmanagementsystem;

import java.util.Scanner;


public class LocalSupplierInfo extends Supplier implements IBonus {
    
    private double daily_fee=1000;
    private double local_supplier_yearly_fee;
    
    
    public void getLocalSupplierInfo(){
    getSupplierInfo();
  }
    
    public void displayLocalSupplierInfo(){
       
        System.out.println("\t Local Supplier (Inside Dhaka)");
        displaySupplierInfo();    
    }
    
    public void calculateLocalSupplierMonthlyFee(){
        System.out.println("Local Supplier Monthly Fee: "+daily_fee*30);
    }
    
    public void calculateLocalSupplierYearlyFee(){
         local_supplier_yearly_fee = daily_fee*360;
        System.out.println("Local Supplier Yearly Fee:  "+local_supplier_yearly_fee);
    }
    
    
      @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus for Local Supplier: "+local_supplier_yearly_fee*0.05);
    }
    
    @Override
    public void puja_bonus(){
        System.out.println("Puja Bonus for Local Supplier: "+local_supplier_yearly_fee*0.03);
    }   
    
}
