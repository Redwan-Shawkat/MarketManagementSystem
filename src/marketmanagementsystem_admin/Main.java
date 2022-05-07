
package marketmanagementsystem_admin;

import marketmanagementsystem.*;

public class Main {

    
    public static void main(String[] args) {
      
       
        //Local Product but Member Buyer 
         System.out.println(".......................................................");
        Location l1 = new Location("Local");
        LocalProductInfo LP1 = new LocalProductInfo();
        LP1.checkLocation(l1);
        System.out.println("\n");
        LP1.displayLocalProductMenu();
        System.out.println("\n");
        LP1.getLocalProductInfo();
        System.out.println("\n");
        LP1.displayLocalProductInfo();
        System.out.println("\n");
        LP1.product_vat();
        
        //System.out.println("Thanks for coming!");
        System.out.println("\n");
        
         System.out.println(".......................................................");
        Category c1 = new Category("Member");
        MemberBuyerInfo Redwan = new MemberBuyerInfo();
        Redwan.checkCategory(c1);
        System.out.println("\n");
        Redwan.getMemberBuyerInfo();
        System.out.println("\n");
        Redwan.displayMemberBuyerInfo();
        System.out.println("\n");
        Redwan.checkPrice1o1(0.08);
        Redwan.checkPrice3o1(0.08);
        
        
        System.out.println("\n");
        System.out.println(".......................................................................");
        
        //Foreign Product but Member Buyer
         System.out.println(".......................................................................");
        Location l2 = new Location("Foreign");
        ForeignProductInfo LP2 = new ForeignProductInfo();
        LP2.checkLocation(l2);
        System.out.println("\n");
        LP2.displayForeignProductMenu();
        System.out.println("\n");
        LP2.getForeignProductInfo();
        System.out.println("\n");
        LP2.displayForeignProductInfo();
        System.out.println("\n");
        LP2.product_vat();
        
        System.out.println("\n");
         System.out.println("..........................................................................");
        
        Category c2 = new Category("Member");
        MemberBuyerInfo Ahmed = new MemberBuyerInfo();
        Ahmed.checkCategory(c2);
        System.out.println("\n");
        Ahmed.getMemberBuyerInfo();
        System.out.println("\n");
        Ahmed.displayMemberBuyerInfo();
        System.out.println("\n");
        Ahmed.checkPrice1o1(0.08);
        Ahmed.checkPrice3o1(0.08);
        
        //System.out.println("Thanks for coming!");
        System.out.println("\n");
        
        
        //Local Product but NonMember Buyer
        System.out.println("....................................................................");
        Location l3 = new Location("Local");
        LocalProductInfo LP3 = new LocalProductInfo();
        LP3.checkLocation(l3);
        System.out.println("\n");
        LP3.displayLocalProductMenu();
        System.out.println("\n");
        LP3.getLocalProductInfo();
        System.out.println("\n");
        LP3.displayLocalProductInfo();
        System.out.println("\n");
        LP3.product_vat();
        
        System.out.println("\n");
        System.out.println(".......................................................................");
        
        Category c3 = new Category("NonMember");
        NonMemberBuyerInfo Joshim = new NonMemberBuyerInfo();
        Joshim.checkCategory(c3);
        System.out.println("\n");
        Joshim.getNonMemberBuyerInfo();
        System.out.println("\n");
        Joshim.displayNonMemberBuyerInfo();
        System.out.println("\n");
        Joshim.checkPrice1o1(0.01);
        Joshim.checkPrice3o3(0.01);
        
        //System.out.println("Thanks for coming!");
        System.out.println("\n");
        System.out.println(".....................................................");
        
        //Foreign Product but NonMember Buyer
         System.out.println(".......................................................");
        Location l4 = new Location("Foreign");
        ForeignProductInfo LP4 = new ForeignProductInfo();
        LP4.checkLocation(l4);
        System.out.println("\n");
        LP4.displayForeignProductMenu();
        System.out.println("\n");
        LP4.getForeignProductInfo();
        System.out.println("\n");
        LP4.displayForeignProductInfo();
        System.out.println("\n");
        LP4.product_vat();
        
        System.out.println("\n");
        System.out.println(".......................................................................");
        
        Category c4 = new Category("NonMember");
        NonMemberBuyerInfo Bepari = new NonMemberBuyerInfo();
        Bepari.checkCategory(c4);
        System.out.println("\n");
        Bepari.getNonMemberBuyerInfo();
        System.out.println("\n");
        Bepari.displayNonMemberBuyerInfo();
        System.out.println("\n");
        Bepari.checkPrice2o2(0.01);
        Bepari.checkPrice4o4(0.01);
        
       
        System.out.println("\n"); 
        System.out.println(".......................................................");
        
        //FullTimerSellerInfo
         System.out.println(".......................................................................");
        Category c5 = new Category("FullTimer");
        FullTimeSellerInfo Auntor = new FullTimeSellerInfo();
        Auntor.checkCategory(c5);
        System.out.println("\n");
        Auntor.getFullTimeSellerInfo();
        System.out.println("\n");
        Auntor.displayFullTimeSellerInfo();
        System.out.println("\n");
        Auntor.calculateFullTImeSellerMontlySalary();
        System.out.println("\n");
        Auntor.eid_bonus();
        Auntor.puja_bonus();
        
         System.out.println(".......................................................");
        
        //PartTimerSellerInfo
         System.out.println(".......................................................................");
        Category c6=new Category("PartTimer");
        PartTimeSellerInfo Robin = new PartTimeSellerInfo();
        Robin.checkCategory(c6);
        System.out.println("\n");
        Robin.getPartTimeSellerInfo();
        System.out.println("\n");
        Robin.displayPartTimeSellerInfo();
        System.out.println("\n");
        Robin.calculateMonthlySalary();
        System.out.println("\n");
        Robin.eid_bonus();
        Robin.puja_bonus();
        
         System.out.println(".......................................................");
        
        //LocalSupplier
         System.out.println(".......................................................");
        Category c7 = new Category("Local");
        LocalSupplierInfo Rehan = new LocalSupplierInfo();
        Rehan.checkCategory(c7);
        System.out.println("\n");
        Rehan.getLocalSupplierInfo();
        System.out.println("\n");
        Rehan.displayLocalSupplierInfo();
        System.out.println("\n");
        Rehan.calculateLocalSupplierMonthlyFee();
        Rehan.calculateLocalSupplierYearlyFee();
        System.out.println("\n");
        Rehan.eid_bonus();
        Rehan.puja_bonus();
        
         System.out.println(".......................................................");
        
        //AbroadSupplier
         System.out.println(".......................................................");
        Category c8 = new Category("Abroad");
        AbroadSupplierInfo Ishita = new AbroadSupplierInfo();
        Ishita.checkCategory(c8);
        System.out.println("\n");
        Ishita.getAbroadSupplierInfo();
        System.out.println("\n");
        Ishita.displayAbroadSupplierInfo();
        System.out.println("\n");
        Ishita.calculateAbroadSupplierMonthlyFee();
        Ishita.calculateAbroadSupplierYearlyFee();
        System.out.println("\n");
        Ishita.eid_bonus();
        Ishita.puja_bonus();
        
         System.out.println(".......................................................");
    
        //CheifGuard
         System.out.println(".......................................................");
        Category c9= new Category("Cheif");
        CheifGuardInfo Nizhum = new CheifGuardInfo();
        Nizhum.getCheifGuardInfo();
        System.out.println("\n");
        Nizhum.displayCheifGuardtInfo();
        System.out.println("\n");
        Nizhum.calculateCheifGuardtMonthlySalary();
        System.out.println("\n");
        Nizhum.eid_bonus();
        Nizhum.puja_bonus();
    
         System.out.println(".......................................................");
         
        //GeneralGuard
         System.out.println(".......................................................");
        Category c10= new Category("General");
        GeneralGuardInfo Rishan = new GeneralGuardInfo();
        Rishan.getGeneralGuardInfo();
        System.out.println("\n");
        Rishan.displayGeneralGuardInfo();
        System.out.println("\n");
        Rishan.calculateGeneralGuardMonthlySalary();
        System.out.println("\n");
        Rishan.eid_bonus();
        Rishan.puja_bonus();
        
         System.out.println(".......................................................");
    }
    
        
}
