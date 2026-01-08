package ArrayDS;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int[] originalArray = new int[sc.nextInt()];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < originalArray.length; i++)
            originalArray[i] = sc.nextInt();

        System.out.print("Original Array: ");
        for (int i = 0; i < originalArray.length; i++)
            System.out.print(originalArray[i] + " ");
        System.out.println();

        int[] reverseArray = new int[originalArray.length];
        for (int i = originalArray.length - 1, j = 0; i >= 0; i--, j++)
            reverseArray[j] = originalArray[i];

        System.out.print("Reversed Array: ");
        for (int i = 0; i < reverseArray.length; i++)
            System.out.print(reverseArray[i] + " ");
        System.out.println();

        sc.close();
    }
}