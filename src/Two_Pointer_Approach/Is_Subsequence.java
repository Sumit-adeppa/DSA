package Two_Pointer_Approach;

import java.util.Scanner;

public class Is_Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s (subsequence): ");
        String s = scanner.nextLine();
        System.out.print("Enter string t (main string): ");
        String t = scanner.nextLine();

        boolean result = isSubsequence(s, t);
        System.out.println("s = \"" + s + "\"");
        System.out.println("t = \"" + t + "\"");
        System.out.println("\"" + s + "\" is" + (result ? "" : " NOT") + " a subsequence of \"" + t + "\": " + result);
        scanner.close();
    }

    static boolean isSubsequence(String s, String t) {
        int i = 0;  // pointer for s
        int j = 0;  // pointer for t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // match found, move to next char in s
            }
            j++;      // always move forward in t
        }

        return i == s.length();  // true if all chars of s found
    }
}
