package ArrayDS;

import java.util.Scanner;

public class SortingEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        String[] dept = {"HR", "IT", "Marketing"};

        String[][] names = new String[3][4];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = sc.next();
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print("Department " + dept[i] + ": ");
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
