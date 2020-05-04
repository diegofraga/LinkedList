package cesar7;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*; 



public class Main {
	

	public static void main(String args[]) throws IOException {
		
		
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		

		
		list1.insertAfter("a");
		list1.insertAfter("j");
		list1.insertAfter("b");		
		list1.insertFirst("f");		
		list1.insertFirst("g");		
		list1.insertAfter("h");		
		list1.insertAfter("i");		
		list1.insertAfter("j");		
		list1.insertAfter("j");	
		list1.insertAfter("j");		
		list1.insertAfter("j");		
		list1.insertAfter("z");		
		list1.insertAfter("x");
		list1.insertAfter("k");
		list1.insertAfter(list1.head.next,"g");
		
		System.out.println("\n\nLinked list 1: "); 
		list1.printList();
	
		list1.RemoveDuplicated();
		
		System.out.println("\n\nLinked list 1 without duplicates: "); 
		list1.printList();
		
		
		list2.insertAfter("d");
		list2.insertAfter("a");
		list2.insertAfter("c");
		list2.insertAfter("f");
		list2.insertAfter("g");
		list2.insertAfter("h");
		list2.insertAfter("z");
		list2.insertAfter("x");
		list2.insertAfter("k");

		
		System.out.println("\n\nLinked list 2: "); 
		list2.printList();
		
		
		
		list1.Intersection(list1,list2);
		
	
		
	}
	

	
}