package org.linkedList;

public class LinkedListUtilities {
    public static Node insertAtHeadNode(Node head, int v) {
        Node newNode = new Node(v);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void insertAtLastNode(Node head, int v) {
        Node newNode = new Node(v);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void printNodes(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public static Node insertAfterNthNode(Node head, int k, int v) {
        int sizeOfLinkedList = LinkedListUtilities.findSizeOfLinkedList(head);
        if (k < 1 || k > sizeOfLinkedList + 1) {
            throw new IllegalArgumentException("Invalid position: k = " + k + ", size = " + sizeOfLinkedList);
        }

        if (head == null) {
            if (k == 1) {
                return LinkedListUtilities.insertAtHeadNode(head, v); // Return new head
            } else {
                throw new IllegalArgumentException("Cannot insert after " + k + "th node in an empty list");
            }
        }

        Node newNode = new Node(v);
        Node temp = head;
        int count = 1;
        while (count < k - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static int findSizeOfLinkedList(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
}
