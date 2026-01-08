package ArrayDS;

import java.util.Scanner;

//Find the sum of the all elements using 2d array.

public class sum_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of the columns: ");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];
        int sum = 0;

//        Get Element form the User.
        System.out.print("Enter the elements of the 2D array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

//       Calculate the sum of the all element.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of the 2D array is: " + sum);
        sc.close();
    }
}
