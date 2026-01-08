package Building_Blocks_of_Math;

import java.util.Scanner;

public class Digit_Counter {
	public static void main(String[] args) {
		// Use Scanner to take user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number = scanner.nextInt();

		int temp = number;

		// Count the number of digits in the numberz
		int sum = 0;
		int count = 0;
		int rev = 0;

		while (temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			sum += digit;
			temp /= 10;
			count++;
		}


		System.out.println("The number " + number + " has " + count + " digits. \nsum:" + sum);
		
		if (number == rev)
			System.out.println(number + " -> Number is Palindrome!");
		else 
			System.out.println(number + " -> Not a Palindrome number!");

		scanner.close();

	}
}

