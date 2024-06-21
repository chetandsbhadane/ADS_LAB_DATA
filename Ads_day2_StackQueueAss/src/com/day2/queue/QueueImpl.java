package com.day2.queue;

import java.util.Arrays;

public class QueueImpl<T> implements Queue<T> {
	
	private Object[] queueArr;
	private int rear;
	private int front;
	private int maxSize;
	
	QueueImpl(int size){
		queueArr = new Object[size];
		rear = -1;
		front = -1;
		maxSize = size;
	}

	/**
	 * Returns the element. push the top element into QUEUE
	 * @return      Element
	 * @param  		element parameter for pushing data into QUEUE at rear side.
	 */
	@Override
	public T enQueue(T element) { 
		if(rear == maxSize-1) { //-1 >= 5
			resizeQueueArr();
//			throw new RuntimeException("Queue is Full");
		}
		++rear;
		queueArr[rear] = element;
		return element;
	}

	/**
	 * Returns the front element. removes front element from QUEUE
	 * @return      FRONT element
	 * @param  		it takes no parameter.
	 */
	@Override
	public T deQueue() {
		if(front == rear) { //-1 == -1 then
			throw new RuntimeException("Queue is Empty");
		}
		++front;
		return (T) queueArr[front];
	}

	/**
	 * Returns the rear element. Basically its showing the element which is on rear
	 * @return      Rear element.
	 * @param  		it takes no parameter.
	 */
	@Override
	public T peek() {
		if(rear==front) {
			throw new RuntimeException("Queue is Empty");
		}
		return (T) queueArr[rear];
	}
	
    /**
     * Resizes the stack to double its current size.
     * @return      void
	 * @param  		it takes no parameter.
     */
    private void resizeQueueArr() {
        maxSize *= 2;
        queueArr = Arrays.copyOf(queueArr, maxSize);
    }

}
