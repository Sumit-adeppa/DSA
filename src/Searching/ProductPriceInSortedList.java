package Searching;

import java.util.Scanner;

public class ProductPriceInSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of product prices
        int n = sc.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Target price to find
        int targetPrice = sc.nextInt();

        // write your code here
        int left = 0;
        int right = prices.length - 1;
        int mid = (left + right) / 2;
        boolean found = false;

        while (left <= right) {
            if (targetPrice == prices[mid]) {
                found = true;
                break;
            }
            else if (targetPrice < prices[mid]) right = mid - 1;
            else if (targetPrice > prices[mid]) left = mid + 1;
            mid = (left + right) / 2;
        }

        System.out.println(found ? "Price found at position: " + (mid + 1) : "Price not found");

    }
}