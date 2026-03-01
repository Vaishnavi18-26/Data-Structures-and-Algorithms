/*
Problem:
Insert a node at the beginning of linked list.
*/

public class InsertAtBeginning {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        head.next = new Node(30);

        head = insert(head, 10);
        printList(head);
    }
}
