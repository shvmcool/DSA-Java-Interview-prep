package LinkedList;

import java.util.*;

public class Finding_pair_sum {
  
	
	
	public static void findSum(ListNode head,int k) {
		final HashSet<Integer> set = new HashSet<>();
		while(head.next!=null) {
			if(set.contains(k-head.val)) {
				System.out.println(head.val+" "+(k-head.val));
				return ;
			}
			set.add(head.val);
			head = head.next;
		}
	}
	
	//Recursive Approach O(n2)
	// Function to check if there exists a pair with given sum using recursion

	   public static boolean check_pair_sum(ListNode head, int sum)
	    {
	        boolean found = false;
	        while (head != null) {
	            found = Finding_pair_sum.findElement(head, sum - head.val);
	            if (found == true) {
	                System.out.println(head.val + " and "
	                                   + (sum - head.val));
	                return found;
	            }
	            head = head.next;
	        }
	        return false;
	    }
	   
	   public static boolean findElement(ListNode head, int element) {
		    while (head != null) { // Traverse the list
		        if (head.val == element) { // Check if the current node's data matches the element
		            return true;
		        }
		        head = head.next; // Move to the next node
		    }
		    return false; // Element not found in the list
		}
	}

