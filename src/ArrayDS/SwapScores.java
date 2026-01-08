package ArrayDS;

import java.util.Scanner;

public class SwapScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < score.length; i++) score[i] = sc.nextInt();

        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        // Swaping the elements
        int temp = score[index1];
        score[index1] = score[index2];
        score[index2] = temp;

        //Printing updated Array
        System.out.print("updated scores: ");
        for (int i = 0; i < n; i++) System.out.print(score[i]);

    }
}
