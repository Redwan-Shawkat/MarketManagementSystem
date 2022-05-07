
package marketmanagementsystem;

import java.util.Scanner;


public class GuardInfo  {
    
    private String name;
    private String shift;
    
    public void getGuardInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Guard's Name: ");
        name=input.nextLine();
        System.out.println("Enter Guard' Shift: ");
        shift=input.nextLine();
    }
    
    public void displayGuardInfo(){
        System.out.println("Guard's Name: "+name);
        System.out.println("Guard's Shift: "+shift);
           }
    
  
    
      public void checkCategory(Category category) {

        if (category.status.equals("Cheif"))
            System.out.println("He/She is the Cheif Guard! ");
        else if (category.status.equals("General")) 
            System.out.println("He/She is a Guard! ");
        else 
            System.out.println("");

     }
}
