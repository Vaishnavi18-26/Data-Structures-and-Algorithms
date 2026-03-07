/*
Problem:
Reverse a queue using stack.
*/

import java.util.*;

public class ReverseQueue {

    static void reverse(Queue<Integer> q) {

        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty())
            stack.push(q.remove());

        while (!stack.isEmpty())
            q.add(stack.pop());
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        reverse(q);

        while (!q.isEmpty())
            System.out.print(q.remove() + " ");
    }
}
