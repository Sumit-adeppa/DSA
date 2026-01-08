package Searching;

import java.util.Scanner;

public class ScrabbleWordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of words
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Target length of the word
        int targetLength = sc.nextInt();

        // write your code here
        String word = "";

        for (int i = 0; i < n; i++) {
            if (words[i].length() <= targetLength) {
                word = words[i];
            }
        }

        System.out.println(word);

    }
}
