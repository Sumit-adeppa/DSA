package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(findGCD(num1, num2));
    }
    public static int findGCD(int a, int b) {
        if (b <= 0) return a;
        return findGCD(b, a % b);
    }
}
