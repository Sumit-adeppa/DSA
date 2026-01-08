package Patterns;

import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Loop for each row
        for (int i = 0; i < n; i++) {

            // Left part (@ and -)
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n - 1) {
                    System.out.print("@");
                } else {
                    System.out.print("-");
                }
            }

            // Right part (* and -)
            for (int k = 0; k < n; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == n - 1) 
                    System.out.print("*");
                else
                    System.out.print("-"); 
            }    

            System.out.println();
        }

        sc.close();
    }
}
