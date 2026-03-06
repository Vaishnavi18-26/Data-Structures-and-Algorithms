/*
Problem:
Implement Queue using linked list.
*/

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int x) {

        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {

        if (front == null) return -1;

        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return val;
    }

    public static void main(String[] args) {

        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println(q.dequeue());
    }
}
