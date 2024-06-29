package com.cdac.binarytree.tester;

import com.cdac.binarytree.BinaryTree;
import com.cdac.binarytree.BinaryTreeInterface;

public class BinaryTreeTester {
  public static void main(String[] args) {
    BinaryTreeInterface tree = new BinaryTree();

    // Add nodes to the tree
    tree.add(5);
    tree.add(3);
    tree.add(7);
    tree.add(2);
    tree.add(4);
    tree.add(6);
    tree.add(8);

    System.out.println("Preorder traversal:");
    tree.preorderTraversal();
    System.out.println();

    System.out.println("Postorder traversal:");
    tree.postorderTraversal();
    System.out.println();

    System.out.println("Total number of nodes:");
    System.out.println(tree.countNodes());

    System.out.println("Total number of leaf nodes:");
    System.out.println(tree.countLeafNodes());

    System.out.println("Number of nodes with value 3:");
    System.out.println(tree.countNodesWithValue(3));

    System.out.println("Number of nodes with value 10:");
    System.out.println(tree.countNodesWithValue(10));

    System.out.println("Height of the tree:");
    System.out.println(tree.height());

    System.out.println("Smallest element in the tree:");
    System.out.println(tree.findSmallest());

    System.out.println("Largest element in the tree:");
    System.out.println(tree.findLargest());

    System.out.println("Deleting node with value 5:");
    tree.delete(5);
    System.out.println("Preorder traversal after deletion:");
    tree.preorderTraversal();
    System.out.println();
  }
}

