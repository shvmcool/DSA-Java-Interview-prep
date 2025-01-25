package LinkedList;

public class Add_Two_Linkedlist_II {
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
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode t1 = reverse(l1);
	        ListNode t2 = reverse(l2);
	        ListNode dummy =new  ListNode(-1,null);
	        ListNode temp = dummy;
	        int c = 0;
	        //   while(t1!=null&& t2!=null){
	        //     int sum = t1.val + t2.val + c;
	        //      c = sum /10;
	        //     dummy.next = new ListNode(sum % 10,null);
	        //     dummy = dummy.next;
	        //     t1 =t1.next;
	        //     t2 = t2.next;
	        //   }
	        //   while(t1!=null){
	        //      int sum = t1.val + c;
	        //      c = sum /10;
	        //     dummy.next = new ListNode(sum % 10,null);
	        //     dummy = dummy.next;
	        //     t1 =t1.next;
	        //   }
	        //   while(t2!=null){
	        //    int sum = t2.val + c;
	        //      c = sum /10;
	        //     dummy.next = new ListNode(sum % 10,null);
	        //     dummy = dummy.next;
	        //     t2 =t2.next;
	        //   } 
	          // Add corresponding nodes from t1 and t2
	        
	        //this below will remove above 3 while
	        while (t1 != null || t2 != null || c != 0) {
	            int sum = c;

	            if (t1 != null) {
	                sum += t1.val;
	                t1 = t1.next;
	            }
	            if (t2 != null) {
	                sum += t2.val;
	                t2 = t2.next;
	            }

	            c = sum / 10;
	            dummy.next = new ListNode(sum % 10);
	            dummy = dummy.next;
	        }
	          if(c!=0){
	             dummy.next = new ListNode(c,null);
	          }
	          return reverse(temp.next);
	    }
	    public ListNode reverse(ListNode head){
	      ListNode prev = null ;
	      ListNode temp = head;
	      while(temp!=null){
	        ListNode next = temp.next;
	        temp.next = prev;
	        prev = temp ;
	        temp = next;
	      }
	      return prev;
	    }
	}
