package com.app.tester;

import java.time.LocalDate;

import com.app.entity.Employee;
import com.app.stack.Stack;
import com.app.stack.StackImpl;

public class TesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalDate date = null;
      
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		//Apna Apna Dekhlo Guyz Peace Out 
		
		Stack st = new StackImpl();
		
		st.push(new Employee("Chetan", "Bhadane", 24, 50000, date.now()));
		st.printStack();
		
	}

}
