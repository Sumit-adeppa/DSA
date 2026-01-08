package ArrayDS;

import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int[] source = new int[sc.nextInt()];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < source.length; i++) source[i] = sc.nextInt();
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) destination[i] = source[i];
        System.out.println("Copied Array: ");
        for (int i = 0; i < destination.length; i++) System.out.print(destination[i] + " ");
        sc.close();
    }
}
