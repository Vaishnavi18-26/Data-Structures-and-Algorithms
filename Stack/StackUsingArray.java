/*
Problem:
Implement stack using array.

Operations:
push, pop, peek
*/

public class StackUsingArray {

    int top = -1;
    int[] stack = new int[10];

    void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return stack[top];
    }

    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());
        System.out.println("Pop: " + s.pop());
    }
}
