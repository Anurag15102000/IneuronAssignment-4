import java.util.*;   
class Q3  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; 
      Scanner in = new Scanner(System.in);     
      original ="2552";   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered number is a palindrome.");  
      else  
         System.out.println("Entered number isn't a palindrome.");   
   }  
} 