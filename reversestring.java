package assignment31;

import java.util.Scanner;

public class reversestring {
       public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter city name :");
		
		String city = sc.nextLine();
		
		for(int i = city.length(); i > 0 ; --i) {
			
			System.out.println(city.charAt(i-1));
		}
		}

}
