package Two_Pointer_Approach;

import java.util.Arrays;
import java.util.Scanner;

public class three_Sum_Closest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(threeSumClosest(arr, target));
    }

    static int threeSumClosest(int[] nums, int target) {
        // Step 1: Sort the Array
        Arrays.sort(nums);
        // Step 2: Initialize the closest Sum
        int closestSum = nums[0] + nums[1] + nums[3];
        // Step 3: Fix the one element
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            // Step 4: Two-pointer approach
            while (left < right) {
                // Update the closest sum if current is closer
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum =  currentSum;
                }
                // Move pointers
                if (currentSum == target) return currentSum;
                else if (currentSum < target) left++;
                else right--;

            }
        }
        return closestSum;
    }

}
