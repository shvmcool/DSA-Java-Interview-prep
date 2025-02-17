package Tree;
import java.util.*;
//Definition for a Node.
class Node {
 public int val;
 public List<Node> children;

 public Node() {}

 public Node(int _val) {
     val = _val;
 }

 public Node(int _val, List<Node> _children) {
     val = _val;
     children = _children;
 }
};

public class Nary_level_order_traversal {
	    public List<List<Integer>> levelOrder(Node root) {
	        List<List<Integer>> ans = new ArrayList<>();
	        if(root == null){
	            return ans;
	        }
	        helper(root, ans);
	        return ans;
	    }

	    public void helper(Node root,List<List<Integer>> ans){
	       Queue<Node> queue = new ArrayDeque<>();
	       queue.add(root);
	      
	       while(!queue.isEmpty()){
	         List<Integer> temp = new ArrayList<>();
	       int size = queue.size();
	        temp.clear();
	        for(int i = 0 ;i<size;i++){
	         if(!queue.peek().children.isEmpty()){
	            queue.addAll(queue.peek().children);
	           }
	            temp.add(queue.poll().val);
	        }
	        if(temp.size()!=0)
	            ans.add(temp);
	       }
	    }
	}
