package Recursion;

import java.util.Scanner;

public class Count_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }

    public static int countDigits(int num) {
        if (num <= 0) return 0;
        return  1 + countDigits(num / 10);
    }

}
