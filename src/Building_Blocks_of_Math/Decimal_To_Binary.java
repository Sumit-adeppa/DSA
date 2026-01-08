package Building_Blocks_of_Math;

import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = scanner.nextInt();
        int temp = decimal;
        
        // Convert decimal to binary
//		System.out.println("The binary equivalent of " + decimal + " is " + DecimalToBinary(decimal) + ".");
		
        String binary = "";
        while (temp > 0) {
        	int digit = temp % 2;
        	binary = digit + binary;
        	temp /= 2;
        }
        
        System.out.println("The binary equivalent of " + decimal + " is " + binary + ".");
        
		scanner.close();

    }

//    static String DecimalToBinary(int number) {
//
//		String binary = "";
//		
//		while (number > 0) {
//			int digit = number % 2;
//			binary = digit + binary;
//			number /= 2;
//		}
//		
//		return binary;
//		
//	}

}