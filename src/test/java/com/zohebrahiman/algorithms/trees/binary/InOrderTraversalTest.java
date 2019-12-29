package com.zohebrahiman.algorithms.trees.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InOrderTraversalTest {

	@Test
	public void traverseTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		Traversal iot = new InOrderTraversal();
		String result = iot.traverse(root);
		Assert.assertEquals(result, "8,4,2,5,1,6,3,9,7");
	}
}
