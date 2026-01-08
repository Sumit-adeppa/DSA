package Searching;

import java.util.Scanner;

public class ClosestBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of tour package costs
        int n = sc.nextInt();

        int[] packageCosts = new int[n];
        for (int i = 0; i < n; i++) {
            packageCosts[i] = sc.nextInt();
        }

        // Customer's budget and minimum threshold
        int budget = sc.nextInt();
        int minThreshold = sc.nextInt();

        // write your code here
        int left = 0, right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (packageCosts[mid] >= minThreshold && packageCosts[mid] <= budget) {
                result = packageCosts[mid];
                left = mid + 1;
            } else right = mid - 1;
        }

        System.out.println(result != -1 ? "Closest package cost within range is: " + result : "No package available within budget and range");

    }
}