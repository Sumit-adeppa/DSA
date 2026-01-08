package Building_Blocks_of_Math;

import java.util.Scanner;

public class Vowels_or_Consonents {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Use Scanner to take user input
		System.out.println("Enter the Character: ");
        char ch = scanner.next().charAt(0);
        
        // Check if the character is a vowel or a consonant
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
            }
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }
            
		
		
        scanner.close();
		
		
	}

}
