package Tree;

public class Maximun_depth_of_array {
	//https://leetcode.com/problems/maximum-depth-of-binary-tree/
	    public int maxDepth(TreeNode root) {
	     return  find(root,0);
	    }
	    public int find(TreeNode root , int max ){
	        if(root == null){
	            return max;
	        }
	       
	        return Math.max( find(root.left,max+1), find(root.right,max+1));
	    }
	}
