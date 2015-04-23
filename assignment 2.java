import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

class assignment2{

     public static void main (String str[]) throws IOException {
      Scanner scan = new Scanner (System.in);
      
      System.out.println ("Please Enter the Cost of the Item: ");
      double cost = scan.nextDouble();
      System.out.println ("Please Enter the Amount Paid: ");
      double paid = scan.nextDouble();
      
      double change = ((10000*paid) - (10000*cost))/10000;
      System.out.println("Change Owed: " + change);
      
      int quarters = (int) (100*change)/25;
      System.out.println("Quarters: " + quarters);
      int dimes = ((int) (100*change)%(quarters*25))/10;
      System.out.println("Dimes: " + dimes);
      int nickels =((int) (100*change)%((quarters*25)+(dimes*10)))/5;
      System.out.println ("Nickels: " + nickels);
      int pennies = ((int) (100*change)%((quarters*25)+(dimes*10)+(nickels*5)));
      System.out.println ("Pennies: " + pennies);
     }
     
}