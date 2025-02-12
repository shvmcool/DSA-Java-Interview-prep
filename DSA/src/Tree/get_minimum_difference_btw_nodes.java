package Tree;

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
