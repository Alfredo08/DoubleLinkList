package com.codingdojo.datastructure;

public class DLL {
	private Node head;
	private Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertFirst( int val ) {
		Node newNode = new Node( val );
		
		if( this.head == null ) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			this.head.setPrevious( newNode );
			newNode.setNext( this.head );
			this.head = newNode;
		}
	}
	
	public void insertLast( int val ) {
		Node newNode = new Node( val );
		if( this.tail == null ) {
			insertFirst( val );
		}
		else {
			this.tail.setNext( newNode );
			newNode.setPrevious( this.tail );
			this.tail = newNode;
		}
	}
	
	public void printForward() {
		Node current = this.head;
		
		while( current != null ) {
			System.out.print( current.getValue() + " ");
			current = current.getNext();
		}
		
		if( this.head == null ) {
			System.out.print( "The list is currently empty" );
		}
	}
	
	public void printBackward() {
		Node current = this.tail;
		while( current != null ) {
			System.out.print( current.getValue() + " ");
			current = current.getPrevious();
		}
		
		if( this.head == null ) {
			System.out.print( "The list is currently empty" );
		}
	}
	
	public void insertAtPosition( int index, int val ) {
		if( length() <= index ) {
			System.out.println( "That index doesn't exist in the list yet!" );
		}
		else {
			if( index == 0 ) {
				insertFirst( val );
			}
			else {
				Node current = this.head;
				Node previous = current;
				int count = 0;
				
				while( count != index ) {
					previous = current;
					current = current.getNext();
					count ++;
				}
				
				Node newNode = new Node( val );
				newNode.setNext( current );
				current.setPrevious( newNode );
				newNode.setPrevious( previous );
				previous.setNext( newNode );
				
			}
		}
	}
	
	public int length() {
		int count = 0;
		Node current = this.head;
		while( current != null ) {
			count ++;
			current = current.getNext();
		}
		return count;
	}
}
