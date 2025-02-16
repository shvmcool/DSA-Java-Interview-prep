package Tree;
import java.util.*;

public class Bottom_view_of_tree {
	    //Function to return a list containing the bottom view of the given tree.
	    public ArrayList <Integer> bottomView(TreeNode root)
	    {
	        // Code here
	    ArrayList <Integer> ans = new ArrayList<>();
	    if(root == null)return ans;
	     Queue<TreeNode> queue = new LinkedList<>();
	     root.hd = 0;
	     queue.add(root);
	     Map<Integer,Integer> treeMap = new TreeMap<>();
	      while(!queue.isEmpty()){
	          TreeNode curr= queue.poll();
	          treeMap.put(curr.hd,curr.val);
	          if(curr.left !=null){
	              curr.left.hd =curr.hd-1;
	              queue.add(curr.left);
	              
	          }
	          if(curr.right !=null){
	                curr.right.hd =curr.hd+1;
	              queue.add(curr.right);
	          }
	      }
	      for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()){
	          ans.add(entry.getValue());
	      }
	      return ans;
	    }
	}
