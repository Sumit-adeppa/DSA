package Building_Blocks_of_Math;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		int count = findDigitCount(number);
		int sum = findSum(number, count);
		
		if (sum == number) 
			System.out.println(number + " is an Armstrong number.");
		else 
			System.out.println(number + " is not an Armstrong number.");
		
		
		scanner.close();

	}
	
	
	static int findDigitCount(int num) {
		int count = 0;
		
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}
	
	static int findPower(int digit, int count) {
		int result= (int)Math.pow(digit, count);
		return result;
	}
	
	static int findSum(int num, int count) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			int power = findPower(digit, count);
			sum += power;
			num /= 10;
		}
		return sum;
	}

}
