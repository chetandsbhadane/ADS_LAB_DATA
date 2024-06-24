package data.structure.linear.list;

import java.util.LinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		
		List list = new SinglyLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
//		list.removeAtFirst();
		list.removeAtLast();
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.remove(2);
	
		
//		list.display();

	}

}
