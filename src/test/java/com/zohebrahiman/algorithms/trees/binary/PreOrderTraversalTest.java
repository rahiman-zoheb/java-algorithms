package com.zohebrahiman.algorithms.trees.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PreOrderTraversalTest {

	@Test
	public void traverseTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		Traversal pot = new PreOrderTraversal();
		String result = pot.traverse(root);
		Assert.assertEquals(result, "1,2,4,8,5,3,6,7,9");
	}
}
