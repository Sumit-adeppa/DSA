package Building_Blocks_of_Math;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		int fib1 = 0;
		int fib2 = 1;
		
		System.out.println("Fibonacci series up to " + num + ":");
		
		if (num == 1) 
			System.out.println(fib1);
		else if (num == 2)
			System.out.println(fib1 + " " + fib2);
		else {
			while (fib1 <= num) {
				System.out.print(fib1 + " ");
				int fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
			}
		}
		
		System.out.println("\nPrime Number: ");
		findFibonacciseries(num);
		
		scan.close();
	}
	
	public static void findFibonacciseries(int num) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = fib1 + fib2;
		while(fib3 <= num) {
			fib3 = fib1 + fib2;
			boolean primestatus = checkPrime(fib3);
			if (primestatus == true)
				System.out.print(fib3 + " ");
			fib1 = fib2;
			fib2 = fib3;
			
		}
		
	}
	
	public static boolean checkPrime(int num) {
		
		if (num < 2)
			return false;
		
		for (int i = 2;  i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}

/*
 * Write a java Program to print the sum of all digits of each amstrong number from 1 till n?
 * 
 * Sample Output: 
 * 1 : 1
 * 2 : 2
 * 3 : 3
 * 4 : 4
 * 5 : 5
 * 6 : 6
 * 7 : 7
 * 8 : 8
 * 9 : 9
 * 153 : 9
 * 371 : 11
 * 407 : 11
 * */
