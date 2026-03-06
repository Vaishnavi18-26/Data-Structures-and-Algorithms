/*
Problem:
Implement Queue using array.

Operations:
enqueue, dequeue
*/

public class QueueUsingArray {

    int front = 0;
    int rear = -1;
    int size = 0;
    int capacity = 10;

    int[] queue = new int[capacity];

    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Full");
            return;
        }

        rear++;
        queue[rear] = x;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue Empty");
            return -1;
        }

        int val = queue[front];
        front++;
        size--;
        return val;
    }

    public static void main(String[] args) {

        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
    }
}
