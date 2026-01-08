package ArrayDS;

import java.util.Scanner;

public class Zig_Zag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int [][]  arr = new int [row][col];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Zig-Zag Order: ");
        for (int j = 0; j < col; j++) {
            if(j % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.println("[" + j + "][" + i + "] : " + arr[i][j]);
                }
            }
            else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.println("[" + j + "][" + i + "] : " + arr[i][j]);
                }
            }
        }
    }
}
