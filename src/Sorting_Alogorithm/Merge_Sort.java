package Sorting_Alogorithm;

import java.util.Scanner;

public class Merge_Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        divide(arr, 0, n-1);

        System.out.print("Sorted Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)  System.out.print(", ");
        }
        System.out.println("]");
    }

    private static void divide(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        divide(arr, left, mid);
        divide(arr, mid+1, right);
        conquer(arr, left, mid, right);
    }

    private static void conquer(int[] arr, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];
        int idx1 = left;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= right) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = left; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

}
