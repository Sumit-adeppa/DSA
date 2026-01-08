package Searching;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Dimensions of the apartment grid
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        char ch = grid[0][0];
        char repeated_char = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ch == grid[i][j]) {
                    repeated_char = ch;
                    count++;
                }
            }
        }

        if (count > 0) {
            System.out.println(repeated_char);
        }

    }
}