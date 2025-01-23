package LinkedList;

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
public class Reverse_Nodes_in_k_group {

	    public ListNode reverseKGroup(ListNode head, int k) {
	       ListNode temp = head;
	       ListNode prev = null;
	       while(temp!=null){
	         ListNode KthNode = findKthNode(temp,k);
	         if(KthNode == null){
	            if(prev!=null) prev.next =temp;
	           break;
	         }
	         ListNode nextNode = KthNode.next;
	         KthNode.next = null;
	         reverseLinkedList(temp);
	         if(temp == head){
	            head = KthNode;
	         }
	         else{
	             prev.next = KthNode;
	         }
	         prev = temp ; 
	         temp = nextNode;
	        }
	            return head;
	    }
	    public ListNode findKthNode(ListNode temp,int k){
	         k-=1;
	         while(temp!=null && k>0){
	            k--;
	            temp=temp.next;
	         }
	         return temp;
	    }

	    public ListNode reverseLinkedList(ListNode head){
	        ListNode prev = null;
	        ListNode temp = head;
	        while(temp!=null){
	            ListNode next = temp.next;
	            temp.next = prev;
	            prev = temp;
	            temp = next;
	        }
	        return prev;
	    }
	    //SECOND APPROCH WITHOUT CALLING HELPERS FUNCTION 
	    class Solution {
	        public ListNode reverseKGroup(ListNode head, int k) {
	            int x=1;
	            ListNode temp =head;
	            while(temp.next != null){
	                x++;
	                temp = temp.next;
	            }
	            ListNode dummy = new ListNode(-1,head);
	           ListNode pre = dummy;
	           
	            while(x/k!=0){
	               ListNode cur = pre.next ;
	            ListNode nex =cur.next;
	                for(int i =1; i < k ; i++){
	                        cur.next = nex.next;
	                        nex.next = pre.next;
	                        pre.next = nex;
	                        nex = cur.next;
	                }
	                x-=k;
	                pre = cur;
	            }
	           

	        return dummy.next;
	        }

	    }
	}

