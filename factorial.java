package assignment1feb;

import java.util.Scanner;

public class factorial {
        

		public static void  main(String args[]) {
		
		
		
		System.out.println("Enter  1 for factorial of  a  number:");
		System.out.print("Enter 2 for exit:");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		
		
		switch(choice){
			case 1 :
				System.out.println("Enter  a number:");
				
				
				int num = sc.nextInt();
				
				int fact =  1;
				
				for(int i =1  ; i <= num ; i ++) {
				
				
				fact = fact * i ;
				
				}
				
				System.out.println("Factorial is:" +  fact + " ");
				break;
				
				
			case 2 :
				System.out.println("Thank you for using .");
				
				break;

				
			default:
				
				
				System.out.println("Wrong input Good Bye");
				
				
			}
		
   }
		
}
		
		
		




		