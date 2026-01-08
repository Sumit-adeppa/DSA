package Building_Blocks_of_Math;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 // Use Scanner to take user input
		System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { 
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
		
        scanner.close();
		
	}

}
