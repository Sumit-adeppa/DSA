package Building_Blocks_of_Math;

import java.util.Scanner;

public class SmallestDigit {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
		// Use Scanner to take user input
		System.out.print("Enter the Digit: ");
		int number = scanner.nextInt();
	
		// Find and print the smallest digit in the number
		int ele = smallest(number); 
		System.out.println(ele);
		
		scanner.close();
		
	}

	private static int smallest(int num) {
		
		int min = 9;
		
		while (num > 0) {
			int digit = num % 10;
			if (digit < min)
				min = digit;
			num /= 10;
		}
		
		return min;
	}

}
