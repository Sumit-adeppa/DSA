package Two_Pointer_Approach;

import java.util.Scanner;

public class Move_Zeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Original: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        moveZeroes(nums);

        System.out.print("After moving zeros: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }

    static void moveZeroes(int[] nums) {
        int write = 0;   // points to where next non-zero should go

        // Step 1: move all non-zero elements to the front
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        // Step 2: fill remaining positions with zero
        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }
}
