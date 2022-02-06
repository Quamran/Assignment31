package assignment31;

import java.util.Scanner;

public class Add3toascii {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
	    char a = sc.next().charAt(0);
	    
	    int Asciivalu = a ;
	    
	    System.out.println(Asciivalu);
	    
	    char Asciichar = (char) (a + 3) ;
	    
	    
	    
	    System.out.println(Asciichar);
	    
	    
	    }

}
