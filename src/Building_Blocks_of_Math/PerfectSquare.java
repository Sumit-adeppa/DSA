package Building_Blocks_of_Math;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect square
        int root = (int) Math.sqrt(number);
        
        if ((root * root) == number)
        	System.out.println(number + " is a perfect square.");
        else 
        	System.out.println(number + " is not a perfect square.");
        
        scanner.close();
    }
}
