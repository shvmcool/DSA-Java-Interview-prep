package Tree;

import java.util.*;

public class level_order_traversal {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> ans = new ArrayList<>();
	        if(root == null){
	            return ans;
	        }
	        helper(root, ans);
	        return ans;
	    }

	    public void helper(TreeNode root,List<List<Integer>> ans){
	       Queue<TreeNode> queue = new ArrayDeque<>();
	       queue.add(root);
	      
	       while(!queue.isEmpty()){
	         List<Integer> temp = new ArrayList<>();
	         int size = queue.size();
	        for(int i = 0 ;i<size;i++){
	      if(queue.peek().left!=null)queue.add(queue.peek().left);
	      if(queue.peek().right!=null)queue.add(queue.peek().right);
	      temp.add(queue.poll().val);
	        }
	        if(temp.size()!=0)
	            ans.add(temp);
	       }
	    }
	}
