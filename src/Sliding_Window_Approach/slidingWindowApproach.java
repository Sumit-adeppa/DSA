package Sliding_Window_Approach;

import java.util.Scanner;

public class slidingWindowApproach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int[] arr = new int[scanner.nextInt()];

        System.out.print("Enter window size: ");
        int k = scanner.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Max Sum: " + slidingWindow(arr, k));

    }

    static int slidingWindow(int[] arr, int k) {

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int max = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum > max) max = windowSum;
        }

        return max;
    }

}
