/*
Problem:
Reverse a string using stack.
*/

import java.util.Stack;

public class ReverseStringStack {

    static String reverse(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        String reversed = "";

        while (!stack.isEmpty())
            reversed += stack.pop();

        return reversed;
    }

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(reverse(str));
    }
}
