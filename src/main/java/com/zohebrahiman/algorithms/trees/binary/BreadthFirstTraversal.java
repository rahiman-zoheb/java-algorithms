package com.zohebrahiman.algorithms.trees.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal implements Traversal {

	public <T> String traverse(Node<T> root) {

		String information = "";

		Queue<Node<T>> q = new LinkedList<Node<T>>();
		q.add(root);

		while (!q.isEmpty()) {
			Node<T> node = q.remove();
			information += processNode(node) + ",";
			if (node.getLeft() != null)
				q.add(node.getLeft());
			if (node.getRight() != null)
				q.add(node.getRight());
		}
		return information.substring(0, information.length() - 1);
	}

	private <T> String processNode(Node<T> node) {
		return node.getData().toString();
	}

}
