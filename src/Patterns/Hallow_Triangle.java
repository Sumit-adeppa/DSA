package Patterns;

import java.util.Scanner;

public class Hallow_Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int sp = n - 1; sp >= i; sp--) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (i == n || j == 1 || j == (2 * i - 1))
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
	
}
