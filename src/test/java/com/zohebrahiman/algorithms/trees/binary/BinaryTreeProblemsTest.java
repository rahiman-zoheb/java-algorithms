package com.zohebrahiman.algorithms.trees.binary;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BinaryTreeProblemsTest {

	@Test
	public void maxDepthTestFalse() {
		assertEquals(BinaryTreeProblems.maximumDepth(null), 0);
	}

	@Test
	public void maxDepthTestRoot() {
		Node<Integer> root = new Node<Integer>(1);
		assertEquals(BinaryTreeProblems.maximumDepth(root), 0);
	}

	@Test
	public void maxDepthTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		assertEquals(BinaryTreeProblems.maximumDepth(root), 3);
	}

	@Test
	public void mirrorTest() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		Node<Integer> left = root.getLeft();
		Node<Integer> right = root.getRight();
		Node<Integer> leftleft = left.getLeft();
		Node<Integer> leftright = left.getRight();
		Node<Integer> rightleft = right.getLeft();
		Node<Integer> rightright = right.getRight();

		BinaryTreeProblems.mirror(root);
		assertNotNull(root);
		assertEquals(root.getLeft(), right);
		assertEquals(root.getRight(), left);
		assertEquals(root.getLeft().getLeft(), rightright);
		assertEquals(root.getLeft().getRight(), rightleft);
		assertEquals(root.getRight().getLeft(), leftright);
		assertEquals(root.getRight().getRight(), leftleft);
	}

	@Test
	public void isBinarySearchTreeFalse() {
		Node<Integer> root = BinaryTreeTestHelper.createBinaryTree();
		assertFalse(BinaryTreeProblems.isBinarySearchTree(root));
	}

	@Test
	public void isBinarySearchTreeTure() {
		Node<Integer> root = BinaryTreeTestHelper.createBinarySearchTree();
		assertTrue(BinaryTreeProblems.isBinarySearchTree(root));
	}

}
