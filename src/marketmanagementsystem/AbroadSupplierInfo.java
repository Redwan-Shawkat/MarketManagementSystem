
package marketmanagementsystem;

public class AbroadSupplierInfo extends Supplier implements IBonus {

  private double daily_fee=2500;
  private double abroad_supplier_yearly_fee;
    
  
  public void getAbroadSupplierInfo(){
    getSupplierInfo();
  }
  
    public void displayAbroadSupplierInfo(){
       
        System.out.println("\t Abroad Supplier (Outside Dhaka)");
        displaySupplierInfo();    
    }
    
    public void calculateAbroadSupplierMonthlyFee(){
        System.out.println("Abroad Supplier Monthly Fee: "+daily_fee*30);
    }
    
    public void calculateAbroadSupplierYearlyFee(){
        abroad_supplier_yearly_fee=daily_fee*360;
        System.out.println("Abroad Supplier Yearly Fee:  "+abroad_supplier_yearly_fee);
    }    
    
     @Override
    public void eid_bonus(){
        System.out.println("Eid Bonus for Abroad Supplier: "+abroad_supplier_yearly_fee*0.05);
    }
    
    @Override
    public void puja_bonus(){
        System.out.println("Puja Bonus for Abroad Supplier: "+abroad_supplier_yearly_fee*0.03);
    }  
}
