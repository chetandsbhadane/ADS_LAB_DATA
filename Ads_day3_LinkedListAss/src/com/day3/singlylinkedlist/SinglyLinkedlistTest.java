package com.day3.singlylinkedlist;

import java.util.List;

public class SinglyLinkedlistTest {
	

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedListImpl();
		
		list.addData(10);
		list.addData(20);
		list.removeDataAtBegining();
		list.display();
		
	}

}
