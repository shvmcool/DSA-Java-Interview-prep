package Tree;

import java.util.*;

public class Boundary_Traversal {
	class Solution {
	    ArrayList<Integer> boundaryTraversal(TreeNode node) {
	        // code here
	        ArrayList<Integer> ans = new ArrayList<>();
	        
	           if (node.left==null && node.right==null) {
	            ans.add(node.val);
	            return  ans;
	        }
	        ans.add(node.val);
	        
	        addLeftBoundary(node.left,ans);
	        
	        addLeafNodes(node,ans);
	        
	         List<Integer> rightinReverse = new ArrayList<>();
	        addRightBoundary(node.right,rightinReverse);
	        Collections.reverse(rightinReverse);
	        ans.addAll(rightinReverse);
	        return ans;
	    }
	    //excluding leaf nodes
	    public void addLeftBoundary(TreeNode node , List<Integer> ans){
	         if(node == null){
	             return;
	         }
	       if(node.left!=null || node.right!=null)
	         ans.add(node.val);
	         node = node.left!=null?node.left:node.right;
	         addLeftBoundary(node,ans);
	         
	    }
	    
	        public void addLeafNodes(TreeNode node , List<Integer> ans){
	         if(node == null){
	             return;
	         }
	         if(node.left == null && node.right == null){
	                      ans.add(node.val);
	         }

	         addLeafNodes(node.left,ans);
	         addLeafNodes(node.right,ans);
	         
	    }
	      //excluding leaf nodes
	       public void addRightBoundary(TreeNode node , List<Integer> ans){
	         if(node == null){
	             return;
	         }
	        if(node.left!=null || node.right!=null)
	         ans.add(node.val);
	         node = node.right!=null?node.right:node.left;
	         addRightBoundary(node,ans);
	         
	    }
	}
}
