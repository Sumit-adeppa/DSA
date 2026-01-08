package Building_Blocks_of_Math;

import java.util.Scanner;

public class nPrimeNumber {

	public static void main(String[] args) {
		// Use Scanner to take user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		// Print the first n prime numbers

		int count = 0;
		int num = 2;

		while (count < n) {
			if (isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}


		scanner.close();
	}

	private static boolean isPrime(int num) {

		if (num <= 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

}
