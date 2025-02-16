package Tree;

import java.util.*;

public class Find_Duplicate_in_tree {
	    Map<String,Integer> map = new HashMap<>();
	    List<TreeNode> ans = new ArrayList<>();
	    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
	         serialize(root);
	         return ans;
	    }
	    public String serialize(TreeNode root){
	       if(root == null) return "#";
	       String stringFormed = serialize(root.left)+','+serialize(root.right)+',' + root.val;
	       map.put(stringFormed,map.getOrDefault(stringFormed,0)+1);
	       if(map.get(stringFormed)== 2){
	          ans.add(root);
	       }
	       return stringFormed;
	    }
	}
