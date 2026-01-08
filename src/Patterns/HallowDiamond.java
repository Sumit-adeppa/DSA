package Patterns;

import java.util.Scanner;

public class HallowDiamond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		//upper half
		for (int i = 1; i <= n; i++) {
			
			for (int sp = n; sp >= i; sp--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1|| j == (2 * i - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
		sc.close();
		
	}
	
}
