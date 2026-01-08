package ArrayDS;

import java.util.Scanner;

public class VowelOrConsents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') System.out.println("Vowels");
        else if (Character.isDigit(ch)) System.out.println("Number");
        else if(Character.isLetter(ch)) System.out.println("Consents");
        else System.out.println("Spacial Characters.");
    }
}
