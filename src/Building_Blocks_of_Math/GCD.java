package Building_Blocks_of_Math;

import java.util.Scanner;

public class GCD {
	
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Find the GCD using the Euclidean algorithm
        int gcd = findGCD(num1, num2);

        // Print the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd + ".");

        scanner.close();
    }
    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        //write your code here
    	
    	while (b != 0) {
    		int temp = b;
    		b = a % b;
    		a = temp;
    	}
    	return a;
        
    }

}
