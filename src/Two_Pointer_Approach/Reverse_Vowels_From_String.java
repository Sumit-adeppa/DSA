package Two_Pointer_Approach;

import java.util.Scanner;

public class Reverse_Vowels_From_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = reverseVowels(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed vowels: " + result);
        scanner.close();
    }

    static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        String vowels = "aeiouAEIOU";
        while (left < right) {
            if (!vowels.contains(arr[left] + "")) {
                left++;
            } else if (!vowels.contains(arr[right] + "")) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
