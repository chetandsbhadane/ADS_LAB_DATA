package com.app.stack;

import com.app.entity.Employee;

public class Node {
	Employee employee;
	Node next;

	public Node(Employee employee) {
		this.employee = employee;
		next = null;
	}
}