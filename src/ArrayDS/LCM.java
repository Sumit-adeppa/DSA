package ArrayDS;

import java.util.Scanner;

public class LCM {

    static int gcd (int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int findLCM(int a, int b) {

//        int result = Math.max(a,b);
//        while (true) {
//            if (result % a == 0 && result % b == 0) break;
//            result++;
//        }
//        return result;

        return (a * b) / gcd(a,b);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(findLCM(a, b));
    }
}
