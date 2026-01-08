package Building_Blocks_of_Math;

import java.util.Scanner;

public class SingleDigitSum {
	
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        // Calculate the sum of digits until it becomes a single-digit number
        int res = findSum(number);
        
        while (res > 9) {
        	res = findSum(res);
        }
        System.out.println("The single-digit sum of digits of " + number + " is " + res + ".");
        
        scanner.close();
    }
    
    static int findSum (int num) {
    	int sum = 0;
    	while (num > 0) {
    		int digit = num % 10;
    		sum += digit;
    		num /= 10;
    	}
    	
    	return sum;
    }

}
