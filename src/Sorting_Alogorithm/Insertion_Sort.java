package Sorting_Alogorithm;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int[] arr = new int[scanner.nextInt()];

        System.out.println("Enter the elements to Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Insertion sort logic
        for (int i =0; i < arr.length ; i++) {
            int temp = arr[i];
            int idx = i - 1;
            while (idx >= 0 && temp < arr[idx]) {
                arr[idx + 1] = arr[idx];
                idx--;
            }
            arr[idx + 1] = temp;
        }

        System.out.print("Sorted Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)  System.out.print(", ");
        }
        System.out.println("]");

    }
}
