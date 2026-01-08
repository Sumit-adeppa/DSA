package Searching;

import java.util.Scanner;

public class LocateMedicationInInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of medication IDs
        int n = sc.nextInt();
        int[] medicationIDs = new int[n];
        for (int i = 0; i < n; i++) {
            medicationIDs[i] = sc.nextInt();
        }
        // Medication ID to search
        int searchMedicationID = sc.nextInt();

        boolean found = false;

        // write your code here
        for (int i = 0; i < medicationIDs.length; i++) {
            if (searchMedicationID == medicationIDs[i]) {
                found = true;
                break;
            }
        }

        if (found) System.out.println("Medication ID " + searchMedicationID+ " is available.");
        else System.out.println("Medication ID " + searchMedicationID+ " is not available.");

    }
}
