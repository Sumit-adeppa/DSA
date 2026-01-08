package ArrayDS;

import java.util.Scanner;

public class FindTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the Key Element to find: ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found.");
                break;
            }
            else System.out.println("Element not found.");
        }
        sc.close();
    }
}
