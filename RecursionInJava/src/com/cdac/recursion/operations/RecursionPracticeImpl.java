package com.cdac.recursion.operations;

import com.cdac.recursion.exceptions.IllegalDivisorException;

public class RecursionPracticeImpl implements RecursionPractice {
  @Override
  public int multiply(int m, int n) {
    if (n == 0) {
      return 0;
    }
    if(m<0 || n<0){
      m = -m;
      n = -n;
    }
    if(n>m) {
      return multiply(n,m);
    }
    return m + multiply(m, n - 1);
  }

  @Override
  public int findQuotient(int m, int n) throws IllegalDivisorException {
    if (n == 0) {
      throw new IllegalDivisorException("Bhau 0 se divide kyu karta hai?");
    }
    if (m < n) {
      return 0;
    }
    return 1 + findQuotient(m - n, n);
  }

  @Override
  public int findRemainder(int m, int n) throws IllegalDivisorException {
    if (n == 0) {
      throw new IllegalDivisorException("Bhau 0 se divide kyu karta hai?");
    }
    if (m < n) {
      return m;
    }
    return findRemainder(m - n, n);
  }
}
