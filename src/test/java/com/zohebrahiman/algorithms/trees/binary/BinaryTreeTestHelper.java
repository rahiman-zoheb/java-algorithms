package com.zohebrahiman.algorithms.trees.binary;

import com.zohebrahiman.algorithms.trees.binary.search.BinarySearchTree;

public class BinaryTreeTestHelper {

	public static Node<Integer> createBinaryTree() {
		Node<Integer> one = new Node<Integer>(1);
		Node<Integer> two = new Node<Integer>(2);
		Node<Integer> three = new Node<Integer>(3);
		Node<Integer> four = new Node<Integer>(4);
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> six = new Node<Integer>(6);
		Node<Integer> seven = new Node<Integer>(7);
		Node<Integer> eight = new Node<Integer>(8);
		Node<Integer> nine = new Node<Integer>(9);

		Node<Integer> root = one;
		root.setLeft(two);
		root.setRight(three);
		two.setLeft(four);
		two.setRight(five);
		three.setLeft(six);
		three.setRight(seven);
		four.setLeft(eight);
		seven.setLeft(nine);
		return root;
	}

	public static Node<Integer> createBinarySearchTree() {
		Node<Integer> one = new Node<Integer>(1);
		Node<Integer> two = new Node<Integer>(2);
		Node<Integer> three = new Node<Integer>(3);
		Node<Integer> four = new Node<Integer>(4);
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> six = new Node<Integer>(6);
		Node<Integer> seven = new Node<Integer>(7);
		Node<Integer> eight = new Node<Integer>(8);
		Node<Integer> nine = new Node<Integer>(9);

		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, four);
		bst.insert(root, one);
		bst.insert(root, nine);
		bst.insert(root, two);
		bst.insert(root, seven);
		bst.insert(root, six);
		bst.insert(root, eight);
		bst.insert(root, three);
		bst.insert(root, five);
		return root;
	}

}
