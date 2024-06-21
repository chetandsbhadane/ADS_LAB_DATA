package com.day2.stack;

import java.util.Arrays;

public class StackImpl<T> implements Stack<T> {
	private Object[] stackData; //Created OBJECT array.. to stored any datatype values..
	private static int top; // -1 -> 0 1 2 3 4

	private int maxSize; //SETTING UP MAXSIZE OF AN ARRAY..
	
	/**
	 * Parametric constructor
	 * @param  		initializing the size,top and maxsize for the given stack of array
	 */
	public StackImpl(int n){
		stackData = new Object[n];
		top = -1;
		maxSize = n;
	}
	
	/**
	 * Returns the element. push the top element into stack
	 * @return      the element.
	 * @param  		element parameter for pushing data into stack.
	 */
	@Override
	public T push(T element) {
		if(isStackFull()) {
			resizeStack();
//			throw new RuntimeException("stack overflow");
		}
		
		++top;
        stackData[top] = element;
        return element;
	}

	/**
	 * Checks Whether stack is FULL or not
	 * @return      true in case of stack full.
	 * @param  		it takes no parameter.
	 */
	@Override
	public boolean isStackFull() {
		return top == maxSize-1;
	}

	/**
	 * Checks Whether stack is EMPTY or not
	 * @return      true in case of stack empty.
	 * @param  		it takes no parameter.
	 */
	@Override
	public boolean isStackEmpty() {
		return top == -1;
	}
	
	/**
	 * Returns the top element. removes top element from stack
	 * @return      true in case of stack empty.
	 * @param  		it takes no parameter.
	 */
	@Override
	public T pop() {
		if(isStackEmpty()) { 
			System.out.println("stack is underflow..");
			throw new RuntimeException("stack Underflow");
		}
		return (T) stackData[top--]; //We have to type casting here due to OBJECT is not TYPE T....
	}

	/**
	 * Returns the top element. Basically its showing the element which is on top
	 * @return      Top element.
	 * @param  		it takes no parameter.
	 */
	@Override
	public T peek() {
		if(top < 0) {
			throw new RuntimeException("Stack is empty");
		}
		return (T) stackData[top]; //We have to type casting here due to OBJECT is not TYPE T....
	}
	
    /**
     * Resizes the stack to double its current size.
     * @return      void
	 * @param  		it takes no parameter.
     */
    private void resizeStack() {
        maxSize *= 2;
        stackData = Arrays.copyOf(stackData, maxSize);
    }
}
