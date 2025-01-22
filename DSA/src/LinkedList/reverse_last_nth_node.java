package LinkedList;

public class reverse_last_nth_node {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        int x =0;
	        ListNode temp = head;
	        while(temp != null){
	            x++;
	            temp = temp.next;
	        }
	        ListNode temp2 = head;
	        if(x == n){
	            return head.next;
	        }
	        for(int i =0 ; i < x ;i++){
	         
	            if(i == x-n-1){
	               temp2.next = temp2.next.next;
	               break;
	            }
	            temp2 = temp2.next;
	        }
	    return head;
	    }
	}
}
