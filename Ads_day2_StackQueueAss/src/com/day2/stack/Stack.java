package com.day2.stack;

public interface Stack<T> {
	T push(T element);
	
	T pop();
	
	boolean isStackFull();
	
	boolean isStackEmpty();
	
	T peek();
}
