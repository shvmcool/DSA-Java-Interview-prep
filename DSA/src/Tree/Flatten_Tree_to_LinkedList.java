package Tree;
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
public class Flatten_Tree_to_LinkedList {
    public void flatten(TreeNode root) {
        TreeNode[] prevarr= new TreeNode[1];
        // helper(root,prevarr);
        helperMorris(root);
    }
//    here we use right -> left -> root because we are building the tree from bottom up 
    public void helper(TreeNode root,TreeNode[] prevarr){
        if(root == null) return ;
         helper(root.right,prevarr);
         helper(root.left,prevarr);
        root.right =prevarr[0];
        root.left = null ;
        prevarr[0] = root;
    }
    //helper morris with pre order
       public void helperMorris(TreeNode root){
        TreeNode cur = root;
        while(cur!=null){
         if(cur.left!=null){
            TreeNode next = cur.left;
            while(next.right!=null){
                next = next.right;
            }
            next.right = cur.right;
            cur.right = cur.left;
            cur.left = null;
         }
            cur = cur.right;
        }
    }
       
       //helper Morris with IN-order
       public void flattenMorrisInOrder(TreeNode root) {
    	    TreeNode cur = root;
    	    TreeNode prev = null;

    	    while (cur != null) {
    	        if (cur.left == null) {
    	            // Process current node
    	            if (prev != null) {
    	                prev.left = null;
    	                prev.right = cur;
    	            }
    	            prev = cur;
    	            cur = cur.right;
    	        } else {
    	            // Find the in-order predecessor
    	            TreeNode pred = cur.left;
    	            while (pred.right != null && pred.right != cur) {
    	                pred = pred.right;
    	            }

    	            if (pred.right == null) {
    	                pred.right = cur; // Create thread
    	                cur = cur.left;
    	            } else {
    	                pred.right = null; // Remove thread

    	                // Process current node (in in-order position)
    	                if (prev != null) {
    	                    prev.left = null;
    	                    prev.right = cur;
    	                }
    	                prev = cur;

    	                cur = cur.right;
    	            }
    	        }
    	    }
    	}
}
