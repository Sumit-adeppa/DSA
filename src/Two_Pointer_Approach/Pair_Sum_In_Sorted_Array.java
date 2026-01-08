package Two_Pointer_Approach;

public class Pair_Sum_In_Sorted_Array {

    public static boolean pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true; // pair found
            }
            else if (sum < target) {
                left++;      // need bigger sum
            }
            else {
                right--;     // need smaller sum
            }
        }

        return false; // no pair found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 10};
        int target = 14;

        System.out.println(pairSum(arr, target));
    }
}

