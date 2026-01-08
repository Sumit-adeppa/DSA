package Two_Pointer_Approach;

import java.util.Scanner;

public class Remove_Palindromic_Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary string (a/b only): ");
        String s = scanner.nextLine();

        int steps = removePalindromeSub(s);

        System.out.println("String: \"" + s + "\"");
        System.out.println("Minimum steps to empty: " + steps);
        scanner.close();
    }

    static int removePalindromeSub(String s) {
        if (s.length() == 0) return 0;

        int left = 0;
        int right = s.length() - 1;

        // Check if string is palindrome
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;  // Not palindrome: remove all 'a' then all 'b'
            }
            left++;
            right--;
        }
        return 1;  // Is palindrome: remove entire string
    }
}
