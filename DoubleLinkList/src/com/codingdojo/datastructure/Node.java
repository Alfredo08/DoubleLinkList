package com.codingdojo.datastructure;

public class Node {
	private int value;
	private Node next;
	private Node previous;
	
	public Node( int val ) {
		this.value = val;
		this.next = null;
		this.previous = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrevious() {
		return this.previous;
	}
	
	public void setValue( int val ) {
		this.value = val;
	}
	
	public void setNext( Node next ) {
		this.next = next;
	}
	
	public void setPrevious( Node previous ) {
		this.previous = previous;
	}
	
}