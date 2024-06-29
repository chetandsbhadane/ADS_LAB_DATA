package com.cdac.linkedlist;

public class CircularDoublyLinkedList implements CircularDoublyLinkedListInterface {
  private Node head;
  private Node tail;

  private class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
    }
  }

  @Override
  public void add(int element) {
    Node newNode = new Node(element);
    if (head == null) {
      head = newNode;
      tail = newNode;
      newNode.next = head;
      newNode.prev = tail;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      newNode.next = head;
      tail = newNode;
      head.prev = tail;
    }
  }

  @Override
  public void delete(int element) {
    if (head == null) return;
    Node current = head;
    do {
      if (current.data == element) {
        if (current == head) {
          head = head.next;
          tail.next = head;
          head.prev = tail;
        } else if (current == tail) {
          tail = tail.prev;
          tail.next = head;
          head.prev = tail;
        } else {
          current.prev.next = current.next;
          current.next.prev = current.prev;
        }
        return;
      }
      current = current.next;
    } while (current != head);
  }

  @Override
  public void deleteAll(int element) {
    if (head == null) return;
    Node current = head;
    do {
      if (current.data == element) {
        Node nextNode = current.next;
        if (current == head) {
          head = head.next;
          tail.next = head;
          head.prev = tail;
        } else if (current == tail) {
          tail = tail.prev;
          tail.next = head;
          head.prev = tail;
        } else {
          current.prev.next = current.next;
          current.next.prev = current.prev;
        }
        current = nextNode;
      } else {
        current = current.next;
      }
    } while (current != head);
  }

  @Override
  public void display() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node current = head;
    do {
      System.out.print(current.data + " ");
      current = current.next;
    } while (current != head);
    System.out.println();
  }
}
