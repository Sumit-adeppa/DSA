package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        alpha(5);
    }

    private static void alpha(int i) {
        if (i == 0)
            return;
        System.out.println("Alpha");
        alpha(i-1);
    }
}
