import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class assignment_5{

  
     public static void main (String str[]) throws IOException {
       Scanner scan = new Scanner(System.in);
       int ast = 0;
       int bad_letter = 0; //flag variables
       System.out.println("Enter the first String:");
       String original = scan.nextLine();
       System.out.println("Enter the Replacement String:");
       String replace = scan.nextLine();
       int x = original.indexOf('*');
       
       for (int i =0; i < original.length(); i++){
         if (original.charAt(i) == '*'){
           ast ++;
           
         }
         else if (!(original.toUpperCase().charAt(i) >='A' && original.toUpperCase().charAt(i) <='Z')){
           bad_letter  ++;
           System.out.println("bad");
         }
         
       }
       if (ast==0)
       {
         System.out.println("Error: no *");
       }
       else if (ast >0 && bad_letter > 0)
       {
         System.out.println("Error: Incorrect characters");
       }
       else
       
         System.out.println(original.substring(0,x) + replace + original.substring(x+1));
                  }

       
     }




  