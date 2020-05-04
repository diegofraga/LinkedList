# LinkedList
5. Remove duplicates on email thread:
When different email clients are used on a same thread, the discussion get messy
because old messages are included again and get duplicated. Given a email thread
(represented by a singly unsorted linked list of messages), write a function that
remove duplicated messages from it.

7. Linked List Intersection:
If two requests on the queue have linked lists that intersect (like the example below),
previous service could be improved to process only the difference between them.
Write a method that receives two singly linked lists and return the intersecting node
of the two lists (if exists). Note that the intersection is defined by reference, not value.
(No need to change previous answer).

T(n) = O(n2)
public void RemoveDuplicated() {
		
		
		
		//Check if the list it's empty
		
		if(head == null) {                                          1
			return;                                                 1
		}
		
		// Create Nodes
		Node node1 = null;                                          1
		Node node2 = null;											1
		Node aux = null;											1
		
		node1= head;												1
		
		// check nodes 
		while(node1 != null && node1.next != null) {				(n+1)
			node2 = node1;											n
			while(node2.next != null) {								(n+1)
				if(node1.message == node2.next.message) {
					
					
					node2.next = node2.next.next;					n	
					System.gc();
				}else {
					node2 = node2.next;								n
				}
				
			}
		node1 = node1.next;											n
		}	
	}
															= 
															=N2 + 6n + 7
