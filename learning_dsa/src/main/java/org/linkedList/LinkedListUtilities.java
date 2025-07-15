package org.linkedList;

import java.util.LinkedList;

public class LinkedListUtilities {

    public static void insertAfterIndexNode(Node head, int k, int v) {
        Node newNode = new Node(v);
        int count = 1;
        Node temp = null;
        temp = head;
        while(count <= k - 1){
            temp = temp.next;
            count++;
        }
        newNode.next =  temp.next;
        temp.next = newNode;

    }
    public static void insertAtHeadNode(Node head,int v){
        Node newNode = new Node(v);
        newNode.next = head;
        head = newNode;
    }
    public static void insertAtLastNode(Node head,int v){
        Node newNode = new Node(v);
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void printNodes(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
