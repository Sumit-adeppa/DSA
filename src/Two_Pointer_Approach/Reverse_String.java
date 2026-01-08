package Two_Pointer_Approach;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of char array: ");
        int n = scanner.nextInt();
        char[] ch = new char[n];
        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            ch[i] = scanner.next().charAt(0);
        }
        System.out.print("Original: ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Fix 1: Make method static to call directly
        reverseString(ch);

        System.out.print("Reversed: ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
        scanner.close();
    }

    // Fix 2: Make method static (removed unnecessary instance creation)
    static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
