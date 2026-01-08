package Searching;

import java.util.Scanner;

public class UnoccupiedDeskInClassroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of rows and columns in the classroom grid
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] desks = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                desks[i][j] = sc.nextInt();
            }
        }

        // write your code here

        boolean found = false;
        int x = 0, y = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (desks[i][j] == 0) {
                    found = true;
                    x = i; y = j;
                    break;
                }
                if (found) break;
            }
        }

        System.out.println(found ? "Unoccupied desk found at Row: " + (x + 1) + ", Column: " + (y + 1) : "No unoccupied desk");

    }
}
