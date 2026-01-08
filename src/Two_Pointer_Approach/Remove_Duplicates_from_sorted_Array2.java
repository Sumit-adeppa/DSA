package Two_Pointer_Approach;

import java.util.Scanner;

public class Remove_Duplicates_from_sorted_Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Original: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int newLength = removeDuplicates(nums);

        System.out.print("After removing duplicates (allows 2 occurrences, " + newLength + " elements): ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        scanner.close();
    }

    static int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n < 2) return n;

        int j = 2;  // Position after allowing first two occurrences

        for (int i = 2; i < n; i++) {
            // Check if current element differs from element two positions back
            if (nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
