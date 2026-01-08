package Building_Blocks_of_Math;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Binary Number: ");
		String binary = scanner.nextLine();
		
		int num = Integer.parseInt(binary);

//		System.out.println(BinaryToDecimal(binary));
		
		System.out.println(BinaryToDecimal1(num));

		scanner.close();

	}

//	static int BinaryToDecimal(String binary) {
//
//		int sum = 0;
//		
//	    for (int i = 0; i < binary.length(); i++) {
//	        int digit = binary.charAt(i) - '0';
//	        sum = sum * 2 + digit;
//	    }
//
//
//		return sum;
//	}
	
	
	static int BinaryToDecimal1(int num) {

		int sum = 0;
		int power = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * (int)Math.pow(2, power); 
			num /= 10;
			power++;
		}

		return sum;
	}

}
