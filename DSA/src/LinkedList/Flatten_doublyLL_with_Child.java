package LinkedList;

public class Flatten_doublyLL_with_Child {
	/*
	// Definition for a Node.
	class Node {
	    public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	};
	*/
	//1ms with recursion
	    public Node flatten(Node head) {
	        if (head == null) {
	            return head;
	        }
	        Node temp = head;
	        while (temp != null) {
	            if (temp.child == null) {
	                temp = temp.next;
	                continue;
	            }
	            Node child = temp.child;
	            Node next = temp.next;
	            Node FlattenNode = flatten(child);
	            temp.next = FlattenNode;
	            FlattenNode.prev = temp;  // Using Recursion
	            temp.child = null;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            if(next !=null){
	            next.prev =temp;
	            temp.next = next;
	            }
	           

	        }
	        return head;
	    }
	    // Second Solution without recursion 0ms
	    class Solution {
	        public Node flatten(Node head) {
	            if( head == null) return head;
	    	// Pointer
	            Node p = head; 
	            while( p!= null) {
	                /* CASE 1: if no child, proceed */
	                if( p.child == null ) {
	                    p = p.next;
	                    continue;
	                }
	                /* CASE 2: got child, find the tail of the child and link it to p.next */
	                Node temp = p.child;
	                // Find the tail of the child
	                while( temp.next != null ) 
	                    temp = temp.next;
	                // Connect tail with p.next, if it is not null
	                temp.next = p.next;  
	                if( p.next != null )  p.next.prev = temp;
	                // Connect p with p.child, and remove p.child
	                p.next = p.child; 
	                p.child.prev = p;
	                p.child = null;
	            }
	            return head;
	        }
	    }
	}

