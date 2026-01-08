package Searching;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of ratings
        int n = sc.nextInt();

        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        // write your code here
        int left = 0, right = n - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (ratings[mid] < ratings[mid + 1]) {
                left = mid + 1;
            } else right = mid;
        }

        System.out.println(ratings[left]);

    }
}
