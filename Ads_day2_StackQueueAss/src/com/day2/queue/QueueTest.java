package com.day2.queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> q = new QueueImpl<>(2);
		
		System.out.println(q.enQueue(10));
		System.out.println(q.enQueue(20));
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.enQueue(30));
		System.out.println(q.enQueue(40));
		System.out.println("rear element " + q.peek());

	}

}
