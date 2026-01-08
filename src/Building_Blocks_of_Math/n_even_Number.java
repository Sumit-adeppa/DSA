package Building_Blocks_of_Math;

import java.util.Scanner;

public class n_even_Number {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Use Scanner to take user input
		System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        // Print the first n even numbers
        System.out.println("The first " + n  + " even numbers are: ");
        for (int i = 1; i <= n ; i++) {
            System.out.println(2 * i);
        }
		
		scanner.close();
	}
	
}
