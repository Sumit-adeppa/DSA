package Patterns;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		for (int i = n - 1; i >= 0; i--) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
//		for (int i = 0; i <= n; i++) {
//			
//			for (int j = n - 1; j >= i; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
		
		sc.close();
	}

}
