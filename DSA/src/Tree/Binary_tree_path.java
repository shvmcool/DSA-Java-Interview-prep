package Tree;
import java.util.*;
public class Binary_tree_path {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
         List<String> temp = new ArrayList<>();
        helper(ans,root,temp);
        return ans;
    }

    public void helper(List<String> ans, TreeNode node,List<String> temp){
        if(node == null){
            return ;
        }
       
         temp.add(String.valueOf(node.val));
          if(node.left == null && node.right == null){
         ans.add(String.join("->",temp));
        }
         helper(ans,node.left,temp);
         helper(ans,node.right,temp);
          temp.remove(temp.size() - 1);
    }
}
