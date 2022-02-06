package assignment31;
import java.util.Scanner;

public class minutandday {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter minutes :");
		
	    float minut = sc.nextFloat();
	    
	    float day = minut / 1440;
	    
	    double year = minut * 1.9013E-6 ;
	    
	    System.out.println( "Day = " +day+ "  "  + "Year = " +year );
	}

}
