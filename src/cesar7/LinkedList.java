package cesar7;

import java.util.HashSet;
import java.util.Set;
/*
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node() { }
};
*/

public class LinkedList {

	Node head; 
	  
    static class Node { 
        
    	String message; 
        Node next; 
          
        Node(String d) {
        	message = d; 
        	next = null;
        } 
    } 
    
    
    public void insertFirst(String message){
    	
    	
    	// Create Node
    	Node new_node = new Node(message);
    	
    	
    	
    	// Add head to be next of this node
    	new_node.next = head;
    	
    	
    	// Add the new HEAD 
    	head = new_node;
    	
    	
    }
    
    
    public void insertAfter(Node prev_node,String message) {
    	
    	//Check if the note exists
    	if(prev_node ==null) {
    		System.out.println("Previous Node not Found");
    		return ;
    	}
    	
    	//Create the new node
    	Node new_node = new Node(message);
    	
    	// Next of new note will be the next of the prev_node
    	new_node.next = prev_node.next;
    	
    	// The prev_node next will be appoint to new_node
    	prev_node.next = new_node;
    	
    }
    
	public void insertAfter(String message) {
	    	
	    	
			//Create the new node
	    	Node new_node = new Node(message);
	    	
	    	//Check if the list it's empty
	    	
	    	if(head == null) {
	    		head = new Node(message);
	    		return;
	    	}
	    	
	    	//Last node, the next always will null
	    	
	    	new_node.next = null;
	    	
	    	//Search the last
	    	Node last = head;
	    	while(last.next!=null)
	    		last = last.next;
	    	
	    	last.next = new_node;
	    	return ;
	    
	}


	public void RemoveDuplicated() {
		
		
		
		//Check if the list it's empty
		
		if(head == null) {
			return;
		}
		
		// Create Nodes
		Node node1 = null;
		Node node2 = null;
		Node aux = null;
		
		node1= head;
		
		// check nodes 
		while(node1 != null && node1.next != null) {
			node2 = node1;
			while(node2.next != null) {
				if(node1.message == node2.next.message) {
					
					
					node2.next = node2.next.next;
					System.gc();
				}else {
					node2 = node2.next;
				}
				
			}
		node1 = node1.next;
		}	
	}

	
	public static void Intersection(LinkedList list1, LinkedList list2) {
		Node node1 = list1.head;
		Node node2 = list2.head;
		Node intersectList = null;
		int cont=0;
		//Check if the lists exists
		if(node1 == null || node2 == null)
			return;
		// Check the intersects
		while (node1 != null ){ 
			node2 = list2.head;
				while (node2 != null ) {
					// find the intersect
			        if (node1.message == node2.message) {
			        	
			        	intersectList = null;
			        	intersectList=CopyList(node1);
			        	
			        	while((node1 != null ) && (node2 != null ) && (node1.message == node2.message)){

					        node1 = node1.next; 
					        node2 = node2.next;
					       
					        if(node1 == null && node2 ==null) {
					        	
					        	cont++;
					        	break;
					        }
			        	}
			        	
			        }
			        if((cont ==0) && node2!=null)
			        	node2 = node2.next; 
			        else
			        	break;
		        }
			if((cont == 0 )&& (node1!=null))
		        node1 = node1.next; 
		    else
		        break; 
		} 
		if(cont ==0) {
			System.out.print("\n\nNo Intersection Node");
			intersectList=null;
		}else {
			System.out.print("\n\nIntersection Node:");
			while(intersectList!=null) {
				System.out.print(intersectList.message + " ");
				intersectList = intersectList.next;
			}
		}
		
	}
	
	public static Node Intersection2(LinkedList list1, LinkedList list2) {
		Node node1 = list1.head;
		Node node2 = list2.head;
		Node intersectList = null;
		int cont=0;
		//Check if the lists exists
		if(node1 == null || node2 == null)
			return intersectList;
		// Check the intersects
		while (node1 != null ){ 
			node2 = list2.head;
				while (node2 != null ) {
					// find the intersect
			        if (node1.message == node2.message) {
			        	
			        	intersectList = null;
			        	intersectList=CopyList(node1);
			        	
			        	while((node1 != null ) && (node2 != null ) && (node1.message == node2.message)){

					        node1 = node1.next; 
					        node2 = node2.next;
					       
					        if(node1 == null && node2 ==null) {
					        	
					        	cont++;
					        	break;
					        }
			        	}
			        	
			        }
			        if((cont ==0) && node2!=null)
			        	node2 = node2.next; 
			        else
			        	break;
		        }
			if((cont == 0 )&& (node1!=null))
		        node1 = node1.next; 
		    else
		        break; 
		} 
		if(cont ==0) {
			intersectList=null;
			return intersectList;
		}else {
			return intersectList;
		}
		
	}
	
	
	// Function that takes a linked list & returns its complete copy
		public static Node CopyList(Node head)
		{
			Node node1 = head;	// used to iterate over original list
			Node newList = null; // head of the new list
			Node next = null;	// point to last node in new list

			while (node1 != null)
			{
				// special case for the first new node
				if (newList == null)
				{
					newList = new Node(node1.message);
					next = newList;
				}
				else
				{
					next.next = new Node(null);
					next = next.next;
					next.message = node1.message;
					next.next = null;
				}
				node1 = node1.next;
			}
			return newList;
		}
    
	public void printList() {
		Node show = head;
		
		while(show!=null) {
			System.out.print(show.message + " ");
			show = show.next;
		}
	}
	   
	
    
}