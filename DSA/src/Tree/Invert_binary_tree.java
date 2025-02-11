package Tree;

public class Invert_binary_tree {
	//https://leetcode.com/problems/invert-binary-tree/
	   public TreeNode invertTree(TreeNode root) {
	        if(root == null) return root ;
	          TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	       invertTree(root.left);
	       invertTree(root.right);
	       return root;
	    }
}
