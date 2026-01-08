package ArrayDS;

import java.util.Scanner;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of players:");
        int numPlayers = scanner.nextInt();

        int[] scores = new int[numPlayers];
        System.out.println("Enter the scores of the players:");
        for (int i = 0; i < numPlayers; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.println("Enter the two indices to swap (e.g., 1 3):");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        int temp = scores[index1];
        scores[index1] = scores[index2];
        scores[index2] = temp;

        System.out.println("Updated Scores: " + Arrays.toString(scores));

        scanner.close();
    }
}
