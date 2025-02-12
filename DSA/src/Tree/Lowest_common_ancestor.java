package Tree;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class Lowest_common_ancestor {
 // divide and conquer way 
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null || root == p || root == q) return root;
//TreeNode left = lowestCommonAncestor(root.left, p, q);
//TreeNode right = lowestCommonAncestor(root.right, p, q);
//return (left != null && right != null) ? root : (left != null ? left : right);
//}
	
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

	        if (p.val > root.val && q.val > root.val) {
	            return lowestCommonAncestor(root.right,p,q);
	        } else if (p.val < root.val && q.val < root.val) {
	            return lowestCommonAncestor(root.left,p,q);
	        }
	        else return root;
	    }
	}
