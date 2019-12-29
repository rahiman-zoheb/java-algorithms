package com.zohebrahiman.algorithms.trees.binary.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohebrahiman.algorithms.trees.binary.BinaryTreeProblems;
import com.zohebrahiman.algorithms.trees.binary.Node;

public class BinarySearchTreeTest {

	private Node<Integer> one;
	private Node<Integer> two;
	private Node<Integer> three;
	private Node<Integer> four;
	private Node<Integer> five;
	private Node<Integer> six;
	private Node<Integer> seven;
	private Node<Integer> eight;
	private Node<Integer> nine;

	@BeforeMethod
	private void init() {
		one = new Node<Integer>(1);
		two = new Node<Integer>(2);
		three = new Node<Integer>(3);
		four = new Node<Integer>(4);
		five = new Node<Integer>(5);
		six = new Node<Integer>(6);
		seven = new Node<Integer>(7);
		eight = new Node<Integer>(8);
		nine = new Node<Integer>(9);
	}

	@Test
	public void insertTestOne() {
		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, four);
		assertEquals(root, four);
		assertNull(root.getLeft());
		assertNull(root.getRight());

	}

	@Test
	public void insertTestThree() {
		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, four);
		bst.insert(root, one);
		bst.insert(root, nine);
		assertEquals(root, four);
		assertEquals(root.getLeft(), one);
		assertEquals(root.getRight(), nine);

	}

	@Test
	public void searchTestTrue() {
		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, four);
		bst.insert(root, one);
		bst.insert(root, nine);
		bst.insert(root, two);
		bst.insert(root, seven);
		bst.insert(root, six);
		bst.insert(root, eight);
		bst.insert(root, three);
		assertEquals(bst.search(root, 3), three);
	}

	@Test
	public void searchTestFalse() {
		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, four);
		bst.insert(root, one);
		bst.insert(root, nine);
		bst.insert(root, two);
		bst.insert(root, seven);
		bst.insert(root, five);
		assertNull(bst.search(root, 6));
	}

	@Test
	public void minValueTestTrue() {
		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, four);
		bst.insert(root, one);
		bst.insert(root, nine);
		bst.insert(root, two);
		bst.insert(root, seven);
		bst.insert(root, five);
		assertEquals(BinaryTreeProblems.minValue(root), Integer.valueOf(1));
	}

	@Test
	public void minValueTestFalse() {
		assertNull(BinaryTreeProblems.minValue(null));
	}

	@Test
	public void minValueTestRoot() {
		BinarySearchTree bst = new BinarySearchTree();
		Node<Integer> root = bst.insert(null, one);
		assertEquals(BinaryTreeProblems.minValue(root), Integer.valueOf(1));
	}

}
