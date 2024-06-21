package com.day2.stack;

public class StackTest {

	public static void main(String[] args) {
		
		// STACK OF INTEGER..
		StackImpl<Integer> stack = new StackImpl<>(2);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
//		System.out.println(stack.peek());
//		stack.pop();
//		System.out.println(stack.peek()); //20
		
		// NOW USING GENERICS WE CAN CRETAE ANY TYPE OF STACK..
		//FOR E.G.
		StackImpl<String> stack2 = new StackImpl<>(5);
		stack2.push("chetan");
		stack2.push("abc");
		System.out.println(stack2.peek());
		stack.isStackFull();
	}

}
