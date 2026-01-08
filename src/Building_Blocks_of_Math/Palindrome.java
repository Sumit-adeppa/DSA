package Building_Blocks_of_Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int temp = number;
        
        // Check if the number is a palindrome
        int rev = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (number == rev) 
            System.out.println(number + " is a palindrome.");
        else 
            System.out.println(number + " is not a palindrome.");
        
        scanner.close();
    }
}
