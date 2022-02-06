package assignment1feb;

import java.util.Scanner;

public class oddoreven {
	
	static void oddoreven(int num) {
		if(num % 2 ==0) {
			
			System.out.print("even number");
			}
		else {
			System.out.print("Odd number");
		}
	}
	 public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number for check odd or even :" + " ");
			
			int num = sc.nextInt();
			
			oddoreven(num);
			
			
	 }
			
			
}
