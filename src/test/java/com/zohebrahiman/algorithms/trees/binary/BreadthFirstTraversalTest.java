package com.zohebrahiman.algorithms.trees.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BreadthFirstTraversalTest  {

	@Test
	public void traverseTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		Traversal bft = new BreadthFirstTraversal();
		String result = bft.traverse(root);
		Assert.assertEquals(result, "1,2,3,4,5,6,7,8,9");
	}

}
