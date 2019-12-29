package com.zohebrahiman.algorithms.trees.binary;

public class BinaryTreeProblems {

	public static Integer minValue(Node<Integer> node) {
		if (node == null)
			return null;
		if (node.getLeft() != null)
			return minValue(node.getLeft());
		else
			return node.getData();
	}

	public static int maximumDepth(Node<Integer> node) {
		if (node == null)
			return 0;
		if (node.getLeft() == null && node.getRight() == null)
			return 0;
		return Math.max(maximumDepth(node.getLeft()), maximumDepth(node.getRight())) + 1;
	}

	public static void mirror(Node<Integer> node) {
		if (node == null)
			return;

		mirror(node.getLeft());
		mirror(node.getRight());

		Node<Integer> temp = node.getLeft();
		node.setLeft(node.getRight());
		node.setRight(temp);
	}

	public static boolean isBinarySearchTree(Node<Integer> node) {
		return isBinarySearchTree(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBinarySearchTree(Node<Integer> node, int min, int max) {
		if (node == null) {
			return true;
		}

		if (node.getData() < min || node.getData() > max) {
			return false;
		}

		return isBinarySearchTree(node.getLeft(), min, node.getData())
				&& isBinarySearchTree(node.getRight(), node.getData(), max);
	}
}
