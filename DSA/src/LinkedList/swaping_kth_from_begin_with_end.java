package LinkedList;

public class swaping_kth_from_begin_with_end {

	 int countListNodes(ListNode head) 
	    { 
	        int count = 0; 
	        ListNode s = head; 
	        while (s != null) { 
	            count++; 
	            s = s.next; 
	        } 
	        return count; 
	    } 
	  
	    // Function for swapping kth ListNodes from both ends of 
	    // linked list 
	    void swapKth(int k,ListNode head) 
	    { 
	        // Count ListNodes in linked list 
	        int n = countListNodes(head); 
	  
	        // Check if k is valid 
	        if (n < k) 
	            return; 
	  
	        // If x (kth ListNode from start) and 
	        // y(kth ListNode from end) are same 
	        if (2 * k - 1 == n) 
	            return; 
	  
	        // Find the kth ListNode from beginning of linked list. 
	        // We also find previous of kth ListNode because we need 
	        // to update next pointer of the previous. 
	        ListNode x = head; 
	        ListNode x_prev = null; 
	        for (int i = 1; i < k; i++) { 
	            x_prev = x; 
	            x = x.next; 
	        } 
	  
	        // Similarly, find the kth ListNode from end and its 
	        // previous. kth ListNode from end is (n-k+1)th ListNode 
	        // from beginning 
	        ListNode y = head; 
	        ListNode y_prev = null; 
	        for (int i = 1; i < n - k + 1; i++) { 
	            y_prev = y; 
	            y = y.next; 
	        } 
	  
	        // If x_prev exists, then new next of it will be y. 
	        // Consider the case when y->next is x, in this 
	        // case, x_prev and y are same. So the statement 
	        // "x_prev->next = y" creates a self loop. This self 
	        // loop will be broken when we change y->next. 
	        if (x_prev != null) 
	            x_prev.next = y; 
	  
	        // Same thing applies to y_prev 
	        if (y_prev != null) 
	            y_prev.next = x; 
	  
	        // Swap next pointers of x and y. These statements 
	        // also break self loop if x->next is y or y->next 
	        // is x 
	        ListNode temp = x.next; 
	        x.next = y.next; 
	        y.next = temp; 
	  
	        // Change head pointers when k is 1 or n 
	        if (k == 1) 
	            head = y; 
	  
	        if (k == n) 
	            head = x; 
	    } 
	  
}
