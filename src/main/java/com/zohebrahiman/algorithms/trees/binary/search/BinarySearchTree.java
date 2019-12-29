package com.zohebrahiman.algorithms.trees.binary.search;

import com.zohebrahiman.algorithms.trees.binary.Node;

public class BinarySearchTree {

	public Node<Integer> insert(Node<Integer> root, Node<Integer> node) {
		if (root == null) {
			return node;
		}

		if (node.getData() <= root.getData()) {
			root.setLeft(insert(root.getLeft(), node));
		} else {
			root.setRight(insert(root.getRight(), node));
		}

		return root;
	}

	public Node<Integer> search(Node<Integer> root, int value) {
		if (root == null) {
			return null;
		}

		if (value == root.getData()) {
			return root;
		} else if (value < root.getData()) {
			return search(root.getLeft(), value);
		} else {
			return search(root.getRight(), value);
		}
	}

}
