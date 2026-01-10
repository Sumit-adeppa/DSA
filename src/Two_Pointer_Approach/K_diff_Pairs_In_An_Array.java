package Two_Pointer_Approach;

import java.util.Arrays;
import java.util.Scanner;

public class K_diff_Pairs_In_An_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(findPairs(arr, k));
    }
    static int findPairs(int[] nums, int k) {

        if (k < 0) return 0;

        Arrays.sort(nums);

        int count = 0;
        int left = 0;
        int right = 1;

        while (right < nums.length) {

            if (left == right) {
                right++;
                continue;
            }

            int diff = nums[right] - nums[left];

            if (diff == k) {
                count++;

                // skip duplicates for left
                while (left + 1 < nums.length && nums[left] == nums[left + 1]) {
                    left++;
                }

                // skip duplicates for right
                while (right + 1 < nums.length && nums[right] == nums[right + 1]) {
                    right++;
                }

                left++;
                right++;
            }
            else if (diff < k) {
                right++;
            }
            else {
                left++;
            }
        }

        return count;
    }
}
