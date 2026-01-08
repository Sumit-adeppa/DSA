package Patterns;

import java.util.Scanner;

public class RightAngleTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
