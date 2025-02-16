package Tree;

public class count_nodes_complte_tree {
	//time complexcity = o(log(n)*log(n)) first log(n) is for  traversal as for 
	 //worst case we will be traversing log(n) and at every traversal we are finding height so log(n) for finding height
	 //as either left or right will be complete binary tree at first step otherwise it will not be complete binary tree
	class Solution {
	    public int countNodes(TreeNode root) {
	        
	        if(root == null){
	            return 0;
	        }
	         int leftHeight = heightOfLeftTree(root);
	         int rightHeight =heightOfRightTree(root);
	        if( leftHeight == rightHeight){
	            return (1<<(rightHeight)) -1;
	        }
	        else{
	            return 1+ (countNodes(root.left)+countNodes(root.right));
	        }
	    }
	    public int heightOfLeftTree(TreeNode root){
	        int count = 0;
	        while(root!=null){
	           count++;
	           root =root.left;
	        }
	     return count;
	    }

	        public int heightOfRightTree(TreeNode root){
	        int count = 0;
	        while(root!=null){
	           count++;
	           root =root.right;
	        }
	     return count;
	    }
	}
}
