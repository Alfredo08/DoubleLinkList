package com.codingdojo.app;
import com.codingdojo.datastructure.DLL;

public class MainApp {
	public static void main( String args[] ) {
		DLL listNums = new DLL();
		
		listNums.insertLast( 100 );
		listNums.insertLast( 150 );
		listNums.insertLast( 200 );
		
		listNums.insertAtPosition(2, 300);
		
		listNums.printForward();
		listNums.printBackward();

	}
}
