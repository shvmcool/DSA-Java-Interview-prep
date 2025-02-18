package Tree;

public class BST_Recover {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	        private TreeNode first = null, second = null, prev = null;
	    public void recoverTree(TreeNode root) {
	        TreeNode[] temp =new TreeNode[]{null,null};
	        helper(root,temp);
	        // Swap values of the two misplaced nodes
	        int swap = first.val;
	        first.val = second.val;
	        second.val = swap;
	    }
	    public void helper(TreeNode root , TreeNode[] temp){
	                if(root == null) return ;
	         helper(root.left,temp);

	         if(prev != null && prev.val > root.val){
	           if(first== null ){
	               first = prev; // storing prev beause it is in-order and there may be 
	               }//possible that after we go back track we find another  which we can place in second
	        //bhai dekh agar sorted hota toh [1,2,3] aata pr abhi [3,2,1] aara hai inorder traversal pr toh first violation pr humne 3 ko prev
	        //mein  store kiya hai  aur 2 ko second mein kyuki aage aur violation hota hai(jaise ki 2 se aur chota milta hia toh ) toh 2 ko replace kr denge  root se
	            second = root;
	         }
	            prev = root; // Update previous node
	           
	            helper(root.right,temp);


	         }
	    }
