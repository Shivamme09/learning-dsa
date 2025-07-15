package org.run;

import org.linkedList.LinkedListUtilities;
import org.linkedList.Node;

public class RunUtility {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node firstNode = new Node(10);
        head.setNext(firstNode);
        Node secondNode = new Node(20);
        firstNode.setNext(secondNode);
        LinkedListUtilities.printNodes(head);
        Node node = LinkedListUtilities.insertAtHeadNode(head,1);
        head = node;
        System.out.println();
        LinkedListUtilities.printNodes(head);
        System.out.println();
        LinkedListUtilities.insertAtLastNode(head,100);
        LinkedListUtilities.printNodes(head);
        int i = LinkedListUtilities.findSizeOfLinkedList(head);
        System.out.println();
        System.out.println("size: "+i);
        LinkedListUtilities.insertAfterNthNode(head,6,600);
        System.out.println();
        LinkedListUtilities.printNodes(head);
        System.out.println();
        i = LinkedListUtilities.findSizeOfLinkedList(head);
        System.out.println("size: "+i);
    }
}