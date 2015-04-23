import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class tweet_tester{

     public static void main (String str[]) throws IOException {
       
     Scanner scan = new Scanner (System.in);
     System.out.println("Please enter a tweet:");
     int hash_count = 0;
     int at_count = 0;
     int link_count = 0;
     int count = 0;
     
     String tweet = scan.nextLine();
     int length = tweet.length();
     
     
    
     if (length > 140){
       System.out.println ("Excess characters: " + (length-140));
     }
     
     else if (length <= 140){
     
     while (count < length){
       if ((count+1) < length){
       if (tweet.charAt(count) == '#' && (tweet.charAt(count+1) != ' ' && tweet.charAt(count+1) != '\t')){
         hash_count++;
       }
       }
       if ((count+1) < length){
       if (tweet.charAt(count) == '@' && (tweet.charAt(count+1) != ' ' && tweet.charAt(count+1) != '\t')){
         at_count++;
       }
       }
       if ((count+7) <= length){
         if (tweet.substring(count, (count+7)).equals("http://")) {
         link_count++;
         }
       }
       
       count++;
           }
           
System.out.println("Length Correct");
System.out.println("Number of Hashtags: " + hash_count);
System.out.println("Number of Attributions: " + at_count);
System.out.println("Number of Links: " + link_count);
     }
     
     
     }
}

           
         
         
         
         
         