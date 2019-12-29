package com.zohebrahiman.algorithms.trees.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepthFirstTraversalTest {

	@Test
	public void traverseTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		Traversal dft = new DepthFirstTraversal();
		String result = dft.traverse(root);
		Assert.assertEquals(result, "8,4,5,2,6,9,7,3,1");
	}
}
