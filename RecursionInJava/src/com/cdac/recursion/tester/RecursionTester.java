package com.cdac.recursion.tester;

import com.cdac.recursion.exceptions.IllegalDivisorException;
import com.cdac.recursion.operations.RecursionPractice;
import com.cdac.recursion.operations.RecursionPracticeImpl;

public class RecursionTester {
  public static void main(String[] args) throws IllegalDivisorException {
    RecursionPractice recursionPractice = new RecursionPracticeImpl();
    System.out.println(recursionPractice.multiply(10, 10));
    System.out.println(recursionPractice.findQuotient(10, 3));
    System.out.println(recursionPractice.findRemainder(10, 3));
  }
}
