package Two_Pointer_Approach;

import java.util.Scanner;

public class Remove_Duplicates_from_sorted_Array {
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

        System.out.print("After removing duplicates (" + newLength + " elements): ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        scanner.close();
    }

    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int write = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i-1]) {
                nums[write] = nums[i];
                write++;
            }
        }
        return write;
    }
}
