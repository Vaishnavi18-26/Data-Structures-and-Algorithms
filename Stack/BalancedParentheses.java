/*
Problem:
Check if parentheses are balanced.
*/

import java.util.Stack;

public class BalancedParentheses {

    static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c == '(')
                stack.push(c);

            else if (c == ')') {
                if (stack.isEmpty())
                    return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "(())";
        System.out.println(isBalanced(str));
    }
}
