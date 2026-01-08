package Two_Pointer_Approach;

import java.util.Scanner;
import java.util.Stack;

public  class BackspaceCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(backspaceCompare(s, t));
    }
    static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    static String buildString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (char ch : stack) {
            builder.append(ch);
        }

        return  builder.toString();

    }
}