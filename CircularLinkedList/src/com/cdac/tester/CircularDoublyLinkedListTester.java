package com.cdac.tester;

import com.cdac.linkedlist.CircularDoublyLinkedList;

public class CircularDoublyLinkedListTester {
  public static void main(String[] args) {
    CircularDoublyLinkedList list = new CircularDoublyLinkedList();

    // Add elements to the list
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(4);

    System.out.println("List after adding elements:");
    list.display();

    // Delete the first occurrence of element 2
    list.delete(10);
    System.out.println("List after trying to deleting first occurrence of 10:");
    list.display();

    // Delete all occurrences of element 2
    list.deleteAll(2);
    System.out.println("List after deleting all occurrences of 2:");
    list.display();

    // Add elements to the list again
    list.add(5);
    list.add(6);

    System.out.println("List after adding more elements:");
    list.display();

    // Delete the first occurrence of element 5
    list.delete(5);
    System.out.println("List after deleting first occurrence of 5:");
    list.display();
  }
}
