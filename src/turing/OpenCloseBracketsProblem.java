package turing;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class OpenCloseBracketsProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (OpenCloseBracketsProblem.isValid(s)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    private static boolean isValid(String s) {
        boolean result = true;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                result = false;
            }

            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '[' || check == '{')
                        result = false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        result = false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        result = false;
                }
                default -> {
                }
            }
        }

        return result;
    }
}
