package com.zohebrahiman.algorithms.trees.binary;

public class InOrderTraversal implements Traversal {

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
		result += processNode(node);
		result += recursiveTraverse(node.getRight());

		return result;
	}

	private <T> String processNode(Node<T> node) {
		return node.getData().toString() + ",";
	}

}
