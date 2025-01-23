package LinkedList;

public class merge_K_SortedLists {
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
	    public ListNode mergeKLists(ListNode[] lists) {
	     if (lists == null || lists.length == 0) {
	            return null; // Handle empty input
	        }
	        return mergeKListsHelper(lists, 0, lists.length - 1);
	    }
	    private ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
	        if (start == end) {
	            return lists[start]; // Base case: single list
	        }
	        int mid = start + (end - start) / 2;
	        ListNode left = mergeKListsHelper(lists, start, mid);
	        ListNode right = mergeKListsHelper(lists, mid + 1, end);
	        return mergeTwo(left, right); // Merge two sorted lists
	    }
	public ListNode mergeTwo(ListNode head1,ListNode head2 ){
	    ListNode temp = new ListNode(-1,null);
	    ListNode x = temp;
	    while(head1!=null && head2!=null){
	       if(head1.val<=head2.val){
	        temp.next = head1;
	        head1=head1.next;
	       }
	       else{
	         temp.next = head2;
	        head2=head2.next;
	       }
	       temp = temp.next;
	    }
	    // if(head1!=null){
	    //     while(head1!=null){
	    //         temp.next = head1;
	    //         head1 = head1.next;
	    //          temp = temp.next;
	    //     }
	    // }
	    //    if(head2!=null){
	    //     while(head2!=null){
	    //         temp.next = head2;
	    //         head2 = head2.next;
	    //          temp = temp.next;
	    //     }
	    // }
	     temp.next = (head1 != null) ? head1 : head2;
	    return x.next;
	}
	}
}
