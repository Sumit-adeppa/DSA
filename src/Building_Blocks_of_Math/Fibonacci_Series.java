package Building_Blocks_of_Math;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int maxNumber = scanner.nextInt();

		// Handle special cases 0 and 1
		if (maxNumber == 0)
			System.out.print("Fibonacci series up to 0: 0");
		else if (maxNumber == 1) {
			System.out.print("Fibonacci series up to 1: 0 1");
		} else {
			// Fibonacci series up to maxNumber using while loop
			int fib1 = 0;
			int fib2 = 1;
			System.out.print("Fibonacci series up to " + maxNumber + ": ");
			while (fib1 <= maxNumber) {
				System.out.print(fib1 + " ");
				int fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
			}
		}
		
		System.out.println();
		
		// Fibonacci series for first 'maxNumber' terms using for loop
		int num1 = 0;
		int num2 = 1;
		if (maxNumber == 0)
			System.out.print("Fibonacci series up to 0: 0");
		else if (maxNumber == 1) 
			System.out.print("Fibonacci series up to 1: 0 1");
		else {
			System.out.print("Fibonacci series (first " + maxNumber + " terms): ");
			for (int i = 0; i < maxNumber; i++) {
				System.out.print(num1 + " ");
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
		}

		scanner.close();
	}
}
