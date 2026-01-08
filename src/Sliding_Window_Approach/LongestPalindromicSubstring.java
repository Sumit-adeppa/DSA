package Sliding_Window_Approach;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "cbbd";
        String max = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr)) {
                    if (substr.length() > max.length()) {
                        max = substr;
                    }
                }
            }
        }

        System.out.println(max);

    }

    public static boolean isPalindrome(String s) {
        int mid = s.length() / 2;
        int i = 0, j = s.length() -1;
        boolean isPalin = true;
        while (i <= mid || j >= mid) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalin = false;
                break;
            }
            i++;
            j--;
        }
        return isPalin;
    }

}
