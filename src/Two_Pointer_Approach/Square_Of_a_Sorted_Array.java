package Two_Pointer_Approach;

import java.util.Scanner;

public class Square_Of_a_Sorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements (non-decreasing):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Original: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] result = sortedSquares(nums);

        System.out.print("Squared sorted: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }

    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
