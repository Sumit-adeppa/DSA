package Two_Pointer_Approach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_Sum {

    static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int comp = target - numbers[i];
            if (map.containsKey(comp)) return new int[]{map.get(comp) + 1, i + 1};
            map.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        int target = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(twoSum(arr, target)));
        scanner.close();
    }
}
