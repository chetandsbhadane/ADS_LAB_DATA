package com.cdac.binarytree;

public interface BinaryTreeInterface {
  void add(int value);
  void preorderTraversal();
  void postorderTraversal();
  int countNodes();
  int countLeafNodes();
  int countNodesWithValue(int value);
  int height();
  int findSmallest();
  int findLargest();
  void delete(int value);
}
