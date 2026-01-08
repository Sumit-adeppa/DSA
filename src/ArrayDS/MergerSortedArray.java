package ArrayDS;

import java.util.*;

public class MergerSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here...
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] num1 = new int[m];
        int[] num2 = new int[n];
        for (int i = 0; i < num1.length; i++) num1[i] = scanner.nextInt();
        for (int i = 0; i < num2.length; i++) num2[i] = scanner.nextInt();
        merge(num1, m, num2, n);
    }

    static void merge(int[] num1, int m, int[] num2, int n) {
        int[] merged = new int[m + n];
        for (int i = 0; i < num1.length; i++) merged[i] = num1[i];
        for (int i = 0; i < num2.length; i++) merged[num1.length + i] = num2[i];
//        Arrays.sort(merged);
//        System.out.print("[");
//        for (int i = 0; i < merged.length; i++) {
//            System.out.print(merged[i]);
//            if (i != merged.length-1) System.out.print(", ");
//        }
//        System.out.println("]");

        for (int i = 0; i < merged.length-1; i++) {
            for (int j = 0; j < merged.length-i-1; j++) {
                if (merged[j] > merged[j+1]){
                    int temp = merged[j];
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i != merged.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
