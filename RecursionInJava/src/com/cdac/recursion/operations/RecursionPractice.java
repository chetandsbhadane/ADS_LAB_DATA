package com.cdac.recursion.operations;

import com.cdac.recursion.exceptions.IllegalDivisorException;

public interface RecursionPractice {
  int multiply(int m,int n);
  int findQuotient(int m, int n) throws IllegalDivisorException; //find quotient of m/n
  int findRemainder(int m, int n) throws IllegalDivisorException;  //find remainder of m/n
}
