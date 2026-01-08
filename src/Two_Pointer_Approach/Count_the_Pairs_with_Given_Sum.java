package Two_Pointer_Approach;

import java.util.HashMap;

public class Count_the_Pairs_with_Given_Sum {

    public static int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int needed = target - num;

            // if the needed number already exists,
            // all its occurrences form valid pairs
            if (freq.containsKey(needed)) {
                count += freq.get(needed);
            }

            // record current number
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        System.out.println(countPairs(arr, target));
    }
}

