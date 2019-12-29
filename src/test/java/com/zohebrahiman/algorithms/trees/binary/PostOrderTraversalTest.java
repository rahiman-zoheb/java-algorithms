package com.zohebrahiman.algorithms.trees.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PostOrderTraversalTest {

	@Test
	public void traverseTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		Traversal pot = new PostOrderTraversal();
		String result = pot.traverse(root);
		Assert.assertEquals(result, "8,4,5,2,6,9,7,3,1");
	}
}
