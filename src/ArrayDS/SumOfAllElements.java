package ArrayDS;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
