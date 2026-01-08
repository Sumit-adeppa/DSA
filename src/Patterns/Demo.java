package Patterns;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String1: ");
		String num1 =sc.nextLine();
		
		BigInteger a = new BigInteger(num1);
		
		System.out.print("Enter String2: ");
		String num2 =sc.nextLine();
		
		BigInteger b = new BigInteger(num2);
		
		BigInteger sum = a.add(b);
		
		System.out.println(sum);
		
		// Convert sum to String
        String sumStr = sum.toString();
        
        System.out.println("Sum as String: " + sumStr);
		
		sc.close();
		
	}
	
}
