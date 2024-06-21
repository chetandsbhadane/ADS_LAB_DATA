package com.day2.queue;

public interface Queue<T> {
	T enQueue(T element);
	
	T deQueue();
	
	T peek();
}
