package Tree;

public class SubTree_of_AnotherTree {
//https://leetcode.com/problems/subtree-of-another-tree/description/
	    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
	          if(subRoot == null){ return true;}
	        if(root == null){ return false;}
	        
	       if(checkIfIdentical(root,subRoot)){
	        return true;
	       }
	       return isSubtree(root.left,subRoot) ||  isSubtree(root.right,subRoot);        
	    }
	    public boolean checkIfIdentical(TreeNode root, TreeNode subRoot){
	       if(root == null && subRoot == null){
	        return true;
	       }
	       if(root==null || subRoot == null || root.val != subRoot.val ){
	        return false;
	       }
	      return checkIfIdentical(root.left,subRoot.left) && checkIfIdentical(root.right,subRoot.right);
	    }
	}
