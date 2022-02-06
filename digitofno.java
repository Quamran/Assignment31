package assignment1feb;

import java.util.Scanner;

public class digitofno {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int count = 0;
		int num = sc.nextInt();
		
		while(num != 0 ) {
			
			num = num / 10 ;
			
			count++ ;

		}
				 
		 System.out.println(count);
		 
		
    }

}
