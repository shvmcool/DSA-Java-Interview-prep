package Tree;


//In-order traversal is used because  it is BST  and now to find minimum difference
//we don't have to compare each node which take O(n2) 
//because by traversing in order we can make it sorted and in o(n) we can find the answer.

public class get_minimum_difference_btw_nodes {
    int ans = Integer.MAX_VALUE;
    Integer prev = null;
public int getMinimumDifference(TreeNode root) {
     if(root == null) return ans;

getMinimumDifference(root.left);
if(prev != null){
    ans = Math.min(ans,root.val - prev);
}
prev = root.val;
getMinimumDifference(root.right);

return ans;

}

}
