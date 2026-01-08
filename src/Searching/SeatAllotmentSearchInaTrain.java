package Searching;

import java.util.Scanner;

public class SeatAllotmentSearchInaTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Dimensions of the seating matrix
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] seats = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = sc.nextInt();
            }
        }

        // Rahul's reserved seat number
        int targetSeat = sc.nextInt();

        // write your code here
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (targetSeat == seats[i][j]) {
                    System.out.println("Seat found at Row: " + i + ", Column: " + j);
                    found = true;
                    break;
                }
            }
        }

        System.out.println(found ? "" : "Seat not found");

        sc.close();

    }
}
