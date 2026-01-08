package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++)
            names[i] = scanner.nextLine();

        System.out.println("Enter name to search: ");
        String key = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < names.length; i++){
            String temp = names[i];
            if (temp.equals(key)) {
                System.out.println("Element found!");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not found!");
        scanner.close();
    }
}
