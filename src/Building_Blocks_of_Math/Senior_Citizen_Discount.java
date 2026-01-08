package Building_Blocks_of_Math;

import java.util.Scanner;

public class Senior_Citizen_Discount {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Age: ");
        int age = scanner.nextInt();
        
        // Check eligibility for a senior citizen discount
        if (age < 60) 
            System.out.println("You are not eligible for a senior citizen discount.");
        else
            System.out.println("You are eligible for a senior citizen discount.");
        
        scanner.close();
    }
}
