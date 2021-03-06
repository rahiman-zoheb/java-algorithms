package com.zohebrahiman.algorithms.trees.binary;

public class PostOrderTraversal implements Traversal {

	public <T> String traverse(Node<T> root) {

		String information = recursiveTraverse(root);

		return information.substring(0, information.length() - 1);
	}

	private <T> String recursiveTraverse(Node<T> node) {
		if (node == null) {
			return "";
		}
		String result = "";
		result += recursiveTraverse(node.getLeft());
		result += recursiveTraverse(node.getRight());
		result += processNode(node);

		return result;
	}

	private <T> String processNode(Node<T> node) {
		return node.getData().toString() + ",";
	}

}
