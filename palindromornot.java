package assignment31;

import java.util.Scanner;

public class palindromornot {
        public static void  main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  a string :");
		String a = sc.nextLine();
		
		int i = 0, j = a.length() - 1 ;
		
		while(i < j) {
			
			if( a.charAt(i) != a.charAt(j)) 
				
				System.out.println(" Not Palindrom");
				
				i++ ;
				j-- ;

			
		}
		     {
				System.out.println("Palindrom");
			}
			
					
		}
        
      }
        



