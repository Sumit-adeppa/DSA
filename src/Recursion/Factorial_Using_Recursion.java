package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }

    private static BigInteger fact(int n) {
        if (n == 0 || n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }

}
