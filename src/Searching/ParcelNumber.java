package Searching;

import java.util.Scanner;

public class ParcelNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Dimensions of the grid
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] parcels = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                parcels[i][j] = sc.nextInt();
            }
        }

        // Parcel number to find
        int parcelNumber = sc.nextInt();

        // write your code here
        boolean found = false;
        int x = -1, y = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (parcels[i][j] == parcelNumber) {
                    x = i; y = j;
                    found = true;
                    break;
                }
                if (found) break;
            }
        }

        System.out.println(found ? "Shelf: " + x + ", Section: " + y : "Parcel not found");

    }
}
