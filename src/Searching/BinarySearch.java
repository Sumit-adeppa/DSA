package Searching;

import java.util.Scanner;

public class BinarySearch {
    /*  is Key == a[mid] --> found!
        is key < a[mid] --> on Left! --> right = mid - 1
        is key < a[mid] --> on right! --> left = mid + 1
    * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();

        System.out.println("Enter Key: ");
        int key = scanner.nextInt();

        int left = 0;
        int right = arr.length-1;
        int mid = (left + right) / 2;
        boolean found = false;

        while (left <= right) {
            if (key == arr[mid]) {
                System.out.println("Element found!");
                found = true;
                break;
            }
            else if (key < arr[mid]) right = mid - 1;
            else if (key > arr[mid]) left = mid + 1;
            mid = (left + right) / 2;
        }

        if (!found) System.out.println("Element not found!");

    }
}
