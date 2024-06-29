package com.cdac.binarytree;

public class BinaryTree implements BinaryTreeInterface {
  private class Node {
    int data;
    Node left, right;

    Node(int item) {
      data = item;
      left = right = null;
    }
  }

  private Node root;

  @Override
  public void add(int value) {
    root = addRecursive(root, value);
  }

  private Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.data) {
      current.left = addRecursive(current.left, value);
    } else if (value > current.data) {
      current.right = addRecursive(current.right, value);
    }

    return current;
  }

  @Override
  public void preorderTraversal() {
    preorderRecursive(root);
  }

  private void preorderRecursive(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    preorderRecursive(node.left);
    preorderRecursive(node.right);
  }

  @Override
  public void postorderTraversal() {
    postorderRecursive(root);
  }

  private void postorderRecursive(Node node) {
    if (node == null) {
      return;
    }
    postorderRecursive(node.left);
    postorderRecursive(node.right);
    System.out.print(node.data + " ");
  }

  @Override
  public int countNodes() {
    return countNodesRecursive(root);
  }

  private int countNodesRecursive(Node node) {
    if (node == null) {
      return 0;
    }
    return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
  }

  @Override
  public int countLeafNodes() {
    return countLeafNodesRecursive(root);
  }

  private int countLeafNodesRecursive(Node node) {
    if (node == null) {
      return 0;
    }
    if (node.left == null && node.right == null) {
      return 1;
    }
    return countLeafNodesRecursive(node.left) + countLeafNodesRecursive(node.right);
  }

  @Override
  public int countNodesWithValue(int value) {
    return countNodesWithValueRecursive(root, value);
  }

  private int countNodesWithValueRecursive(Node node, int value) {
    if (node == null) {
      return 0;
    }
    int count = (node.data == value) ? 1 : 0;
    count += countNodesWithValueRecursive(node.left, value);
    count += countNodesWithValueRecursive(node.right, value);
    return count;
  }

  @Override
  public int height() {
    return heightRecursive(root);
  }

  private int heightRecursive(Node node) {
    if (node == null) {
      return 0;
    }
    int leftHeight = heightRecursive(node.left);
    int rightHeight = heightRecursive(node.right);
    return 1 + Math.max(leftHeight, rightHeight);
  }

  @Override
  public int findSmallest() {
    if (root == null) {
      throw new IllegalStateException("Binary search tree is empty");
    }
    Node current = root;
    while (current.left != null) {
      current = current.left;
    }
    return current.data;
  }

  @Override
  public int findLargest() {
    if (root == null) {
      throw new IllegalStateException("Binary search tree is empty");
    }
    Node current = root;
    while (current.right != null) {
      current = current.right;
    }
    return current.data;
  }

  @Override
  public void delete(int value) {
    root = deleteRecursive(root, value);
  }

  private Node deleteRecursive(Node current, int value) {
    if (current == null) {
      return null;
    }

    if (value < current.data) {
      current.left = deleteRecursive(current.left, value);
    } else if (value > current.data) {
      current.right = deleteRecursive(current.right, value);
    } else {
      // Case 1: No child or only one child
      if (current.left == null) {
        return current.right;
      } else if (current.right == null) {
        return current.left;
      }

      // Case 2: Node to be deleted has two children
      current.data = findInorderPredecessor(current.left);
      current.left = deleteRecursive(current.left, current.data);
    }
    return current;
  }

  private int findInorderPredecessor(Node node) {
    while (node.right != null) {
      node = node.right;
    }
    return node.data;
  }
}
