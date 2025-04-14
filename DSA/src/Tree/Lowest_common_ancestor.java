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

  // LCA part 2 when we have to find out then whether p or q is there in tree then find out this is chat gpt solution
//class Solution {
//
//    private TreeNode answer = null;
//    private boolean foundP = false;
//    private boolean foundQ = false;
//
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        findLowestCommonAncestor(root, p, q);
//        // Only return answer if both nodes were actually found in the tree
//        return (foundP && foundQ) ? answer : null;
//    }
//
//    private boolean findLowestCommonAncestor(TreeNode currentNode, TreeNode p, TreeNode q) {
//        if (currentNode == null) return false;
//
//        boolean left = findLowestCommonAncestor(currentNode.left, p, q);
//        boolean right = findLowestCommonAncestor(currentNode.right, p, q);
//
//        boolean mid = (currentNode == p || currentNode == q);
//        if (currentNode == p) foundP = true;
//        if (currentNode == q) foundQ = true;
//
//        // If any two of the three flags are true, we found the LCA
//        if ((mid && left) || (mid && right) || (left && right)) {
//            answer = currentNode;
//        }
//
//        return mid || left || right;
//    }
//}
