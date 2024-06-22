package com.day3.singlylinkedlist;

public class SinglyLinkedListImpl implements SinglyLinkedList {
	
	private Node head;
	private Node tail;
	private Node newNode;
	public SinglyLinkedListImpl(){
		
		head = null;
		tail = null;
	}

	@Override
	public void addData(int ele) {
		newNode = new Node(ele); //cretaed new node and pasing the ele to the node ctor...
		if(head == null) { //checking if head is null? if yes then assign newnode to head and tail both..
			head = newNode;
			tail = newNode;
		}
		else { //otherwise list in not null
			tail.next = newNode;  
			tail = newNode;
		}
	}
	

	@Override
	public void removeDataAtBegining() {
		if(head == null) {
			System.out.println("List is empty");
		}
		
//		Node temp = head;
		head = head.next;
	}
	
	
	
	
	
	
	
	
	
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }


}
