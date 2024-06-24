package data.structure.linear.list;


public class SinglyLinkedList implements List {
	
	// Private member variables for the head of the list and the next node
	private Node head; 
	private Node nextNode;
	
	// Constructor initializing the head and nextNode to null
	public SinglyLinkedList(){
		head = null; //initially head should be null
		nextNode = null; //as well as nextNode also should be null
	}

	// Override the add method defined in the List interface
	@Override
	public void add(int ele) {
		// Create a new Node with the given element
		Node newNode = new Node(ele);
		
		// If the list is empty, set both head and nextNode to the new node
		if(head == null) {
			head = newNode; //10
			nextNode = newNode; 
		}
		else {
			// Append the new node to the end of the list
			nextNode.node = newNode;
			nextNode = newNode;
//			System.out.println(nextNode.data);
		}	
	}
	
	// Method to display all elements in the list
	public void display() {
		// Start from the head of the list
		Node current = head;
		// Traverse through the list and print each element
		while(current != null) {
			System.out.println(current.data);
			current = current.node;
		}
	}

	@Override
	public void removeAtFirst() { //0  1  2  3
									//10 11 12 13
		if(head == null) {
			throw new RuntimeException("list is empty..");
		}
		
		head = head.node;
	}

	@Override
	public void removeAtLast() {
		if(head == null) {
			throw new RuntimeException("list is empty..");
		}
		
		Node current = head;
//		System.out.println("current.node.node.data " + current.node.node.data);
//		System.out.println("current.node.node " + current.node.data);
		while(current.node.node != null) {
			current = current.node;
			System.out.println(current.data);
		}
		current.node = null;
	}
}
