package Tree;

public class Count_Good_Node_in_Tree {
	  //https://leetcode.com/problems/count-good-nodes-in-binary-tree/
	    public int goodNodes(TreeNode root) {
	       return  helper(root,root.val);
	    }
	    public int helper(TreeNode root ,int max){
	        if(root ==null){
	            return 0;
	        } 
	        int count = 0;
	        if(root.val >= max){
	           count=count+1;
	        }
	       max = Math.max(max,root.val);
	       count += helper(root.left,max);
	       count += helper(root.right,max);
	       return count;
	       
	    }
	}
