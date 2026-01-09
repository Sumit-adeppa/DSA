package Two_Pointer_Approach;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferencePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(minDifference(arr));
        scanner.close();
    }

    static int minDifference(int[] arr) {

        // Edge case: less than 2 elements
        if (arr.length < 2) return -1;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize minimum difference
        int minDiff = Integer.MAX_VALUE;

        // Step 3: Compare adjacent elements
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
