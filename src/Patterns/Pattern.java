package Patterns;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = n ; j >= i; j--) {
				System.out.print("-");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			for (int p = 1; p < n; p++) {
				System.out.print("*");
			}
			
			for (int q = 0; q <= i; q++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
