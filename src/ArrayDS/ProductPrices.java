package ArrayDS;

import java.util.Scanner;

public class ProductPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        String[] category = {"Fruits", "Vegetables", "Diary"};

        String[][] products = new String[3][4];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                products[i][j] = sc.next();
            }
        }

        for (int i = 0; i < products.length; i++) {
            System.out.print("Department " + category[i] + ": ");
            for (int j = 0; j < products[i].length; j++) {
                System.out.println(products[i][j] + " ");
            }
            System.out.println();
        }

    }
}
