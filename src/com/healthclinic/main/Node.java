package com.healthclinic.main;

/**
 * -- Q2.b - Implement a Node suitable for a Binary Tree
 * Node - a class to represent a Node
 *
 * @author Tim Winwood - x20213638
 * @version 1.0
 */
public class Node<T> {

	// instance variables
	private Object element;
	private Node<T> left;
	private Node<T> right;

	/**
	 * Node constructor
	 */
	public Node(Object element) {

		this.element = element;
		this.left = null;
		this.right = null;

	}

	/**
	 * get the element
	 * 
	 * @return the element
	 */
	public Object getElement() {
		return this.element;
	}

	/**
	 * set the element
	 * 
	 * @param element the element
	 */
	public void setElement(Object element) {
		this.element = element;
	}

	/**
	 * get the left Node
	 * 
	 * @return the left Node
	 */
	public Node<T> getLeft() {
		return left;
	}

	/**
	 * set the left Node
	 * 
	 * @param left the left Node
	 */
	public void setLeft(Node<T> left) {
		this.left = left;
	}

	/**
	 * get the right Node
	 * 
	 * @return the right Node
	 */
	public Node<T> getRight() {
		return right;
	}

	/**
	 * set the right Node
	 * 
	 * @param right the right Node
	 */
	public void setRight(Node<T> right) {
		this.right = right;
	}

	/**
	 * returns a boolean representing if the Node is internal
	 * 
	 * @return boolean representing if the Node is internal
	 */
	public boolean isInternal() {
		return ((left != null) || (right != null));
	}

	/**
	 * returns a boolean representing if the Node is external
	 * 
	 * @return boolean representing if the Node is external
	 */
	public boolean isExternal() {
		return ((left == null) && (right == null));
	}

	/**
	 * returns the string representation of the Node object
	 *
	 * @return the string representation of the Node object
	 */
	@Override
	public String toString() {

		return "Node{\n"
		+"element:" + "\n" + element.toString() + "\n"
		+ "left:" + "\n" + left.toString() + "\n"
		+ "right:" + "\n" + right.toString() + "\n"
		+"}";

	}

}
