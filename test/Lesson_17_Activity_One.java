/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_One {
    public static void main(String[] args)
     {
     /* Scanner scan = new Scanner (System.in);
      System.out.println("Enter the Scores: ");
      double n = 0;
      double c= 0;
      double count = 0;
      while (n != -1){
        n = scan.nextInt();
        c = n +c;
        count++;
      }
      c = c+1;
      count--;
      System.out.println("The average is: " + 1.0*(c/count));

*/
      
      
 Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter two numbers: ");
     int x = scan.nextInt();
     int y = scan.nextInt();
     
     if (x % 2 == 1)
     
     while ((x + 1) <=y)
     {
         System.out.print((x + 1) + " ");
       x = x + 2;
       
     }
     if (x % 2 == 0)
       while (x <=y)
     {
       System.out.print(x + " ");
     x = x + 2;
     }
       
}
}

