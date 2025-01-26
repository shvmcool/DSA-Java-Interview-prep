package LinkedList;

public class convert_LL_to_Height_balanced_tree {
	  public TreeNode sortedListToBST(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        if(head.next==null)
	            return new TreeNode(head.val);

	        ListNode midprev = findMiddle(head);
	        ListNode mid = midprev.next;
	        TreeNode res = new TreeNode(mid.val);
	        ListNode rightHalf =  mid.next ;
	        midprev.next = null;
	        res.left = sortedListToBST(head);
	        res.right = sortedListToBST(rightHalf);
	         return res ;
	    }
	    public ListNode findMiddle(ListNode head){
	        ListNode slow = head ; 
	        ListNode fast = head ;
	        ListNode prev = null;
	        while(fast!=null && fast.next!=null ){
	            prev = slow;
	            slow=slow.next;
	            fast = fast.next.next;
	        }
	        return prev;
	    }
}
