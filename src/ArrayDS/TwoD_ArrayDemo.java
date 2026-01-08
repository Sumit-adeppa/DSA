package ArrayDS;

import java.util.Scanner;

public class TwoD_ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int row = scanner.nextInt();
        System.out.print("Enter the size of column: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter elements to Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] :");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements in the Array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}
