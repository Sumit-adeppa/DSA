package Two_Pointer_Approach;

import java.util.Scanner;

public class Remove_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter value to remove: ");
        int val = scanner.nextInt();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Original: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int newLength = removeElement(nums, val);

        System.out.print("After removing " + val + " (" + newLength + " elements): ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        scanner.close();
    }

    static int removeElement(int[] nums, int val) {
        int write = 0;   // position to place next valid element

        for (int read = 0; read < nums.length; read++) {
            // if current element is NOT equal to val, keep it
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }

        // write tells how many elements are NOT equal to val
        return write;
    }
}
