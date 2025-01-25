package LinkedList;

public class copyList_with_Random_pointer {
	/*
	// Definition for a Node.
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	*/
	    public Node copyRandomList(Node head) {
	        Node temp = head;
	        Node temp2 = head;
	        Node temp3 = head;
	        // 1 step // inserting the node in between
	        while (temp != null) {
	            Node node = new Node(temp.val);
	            node.next = temp.next;
	            temp.next = node;
	            temp = temp.next.next;
	        }
	        // 2 step // connecting random nodes

	        while (temp2 != null) {
	            Node copynode = temp2.next;
	            if (temp2.random == null) {
	                copynode.random = null;
	            } else {
	                copynode.random = temp2.random.next;
	            }
	                            temp2 = temp2.next.next;
	        }

	            // step 3 connecting th enext pointer
	            Node dummy = new Node(-1);
	            Node res = dummy;
	            
	            while(temp3 != null){
	                dummy.next = temp3.next;
	                temp3.next = temp3.next.next;
	                dummy = dummy.next;
	                temp3 = temp3.next;

	            }
	            return res.next;
	    }
}
