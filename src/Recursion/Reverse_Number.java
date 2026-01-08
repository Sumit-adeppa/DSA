package Recursion;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int rev = reverse(num, 0);
        System.out.println(rev);
        System.out.println(isPalindrome(num, rev));
    }

    public static int reverse(int num, int rev) {
        if (num == 0) return rev;
        int digit = num % 10;
        return reverse(num / 10, rev * 10 + digit);
    }

    public static String isPalindrome(int num, int rev) {
        return num == rev ? "Palindrome" : "Not Palindrome";
    }
}
