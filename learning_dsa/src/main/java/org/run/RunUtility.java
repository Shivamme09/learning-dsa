package org.run;

import org.linkedList.LinkedListUtilities;
import org.linkedList.Node;
import org.searching.SearchingTechniques;
import org.sorting.SortingTechniques;

import java.util.*;

public class RunUtility {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node firstNode = new Node(10);
        head.setNext(firstNode);
        Node secondNode = new Node(20);
        firstNode.setNext(secondNode);
        LinkedListUtilities.printNodes(head);
        LinkedListUtilities.insertAtHeadNode(head,1);
        //head = node;
        System.out.println();
        LinkedListUtilities.printNodes(head);
    }
}