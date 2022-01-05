package com.healthclinic.main;

/**
 * - Q2.c - Implement a Binary Tree
 * BinaryTree - a class that provides a Binary Tree
 *
 * @author Tim Winwood - x20213638
 * @version 1.0
 */
public class BinaryTree<T extends Comparable<T>> {

	// instance variables
	private Node<T> root;

	/**
	 * Binary Tree constructor
	 */
	public BinaryTree() {

		// initialise the root as null
		this.root = null;
	}

	/**
	 * returns the root of the Binary tree
	 * 
	 * @return the root
	 */
	public Node<T> root() {

		// return the root Node
		return root;
	}

	/**
	 * counts the Nodes in the Binary Tree starting from the Root Node
	 * 
	 * @return the node count starting from the Root Node
	 */
	public int count() {

		// call the recursive count() method, passing the root Node via the method parameter
		return count(root());
	}

	/**
	 * counts the Nodes in the Binary Tree starting from the 'curr' Node passed via method parameter recursive method
	 * 
	 * @return the Node count starting from the 'curr' Node passed via method parameter
	 */
	private int count(Node<T> curr) {

		// base case - 'curr' is null
		if (curr == null) {
			return 0;
		}

		// recursive case - go down left branch
		int leftCount = count(curr.getLeft());

		// recursive case - go down right branch
		int rightCount = count(curr.getRight());

		// return the count
		return 1 + leftCount + rightCount;

	}

	/**
	 * checks if the tree is empty
	 * 
	 * @return boolean representing if the tree is empty
	 */
	public boolean isEmpty() {

		// return if the root Node is null
		return (this.root == null);
	}

	/**
	 * inserts an element in the Binary Tree starting from the Root Node
	 * 
	 * @param element the element to insert
	 */
	public void insert(Object element) {

		// call the recursive insert() method, passing the root Node, and element via the method parameters
		this.root = insert(root(), element);
	}

	/**
	 * inserts an element in the Binary Tree starting from the 'start' Node passed via method parameter recursive method
	 * 
	 * @param start   the Node to start from
	 * @param element the element to insert
	 * @return
	 */
	private Node<T> insert(Node<T> start, Object element) {

		// base case - 'start' Node is null, create and return a new Node
		if (start == null) {
			start = new Node<T>(element);
			return start;
		}

		// recursive case - element calories are less than start.element calories, go down left branch
		if (((Comparable) element).compareTo((Comparable) start.getElement()) < 0) {
			start.setLeft(insert(start.getLeft(), element));

			// recursive case - element calories are more than start.element calories, go down right branch
		} else if (((Comparable) element).compareTo((Comparable) start.getElement()) > 0) {
			start.setRight(insert(start.getRight(), element));
		}

		// return the 'start' Node
		return start;

	}

	/**
	 * finds the element with the highest calories starting from the root Node
	 * 
	 * @return the element with the highest calories
	 */
	public Object findElementHighestCalories() {

		// if the list is empty, return null
		if (isEmpty()) {
			return null;
		}

		// call the recursive findElementHighestCalories() method, passing the root Node via the method parameter
		return findElementHighestCalories(root());

	}

	/**
	 * finds the element with the highest calories starting from the 'curr' Node passed via method parameter recursive method
	 * 
	 * @return the element with the highest calories
	 */
	private Object findElementHighestCalories(Node<T> curr) {
		
		// base case - if right is null, 'curr' is the highest
		if (curr.getRight() == null) {
			return curr.getElement();
		}
		
		// recursive case - go down the right branch
		return findElementHighestCalories(curr.getRight());

	}

	/**
	 * finds the element with the lowest calories starting from the root Node
	 * 
	 * @return the element with the lowest calories
	 */
	public Object findElementLowestCalories() {

		// if the list is empty, return null
		if (isEmpty()) {
			return null;
		}

		// call the recursive findElementLowestCalories() method, passing the root Node via the method parameter
		return findElementLowestCalories(root());

	}

	/**
	 * finds the element with the lowest calories starting from the 'curr' Node passed via method parameter recursive method
	 * 
	 * @return the element with the lowest calories
	 */
	private Object findElementLowestCalories(Node<T> curr) {

		// base case - if left is null, 'curr' is the lowest
		if (curr.getLeft() == null) {
			return curr.getElement();
		}
		
		// recursive case - go down the left branch
		return findElementLowestCalories(curr.getLeft());

	}

	/**
	 * prints the contents of the Binary tree (In-Order Traversal) starting from the root Node
	 * 
	 */
	public void inOrderTraversal() {
		inOrderTraversal(root());
	}

	/**
	 * prints the contents of the Binary  tree (In-Order Traversal) starting from the 'curr' Node passed via method parameter recursive method
	 * 
	 */
	private void inOrderTraversal(Node<T> curr) {
		
		// base case - 'curr' Node is null, return
		if (curr == null) {
			return;
		}
		
		// recursive case - go down the left branch

		// print the current element
		System.out.println(curr.getElement().toString());
		
		// recursive case - go down the right branch
		inOrderTraversal(curr.getRight());

	}

}
