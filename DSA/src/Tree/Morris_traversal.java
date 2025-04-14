package Tree;

import java.util.*;

//in O(1) space complexicity 
public class Morris_traversal {
	public List<TreeNode> Inorder(TreeNode root){
		 List<TreeNode> Inorder = new ArrayList<>();
		 TreeNode cur = root;
		 while(cur!=null) {
			 if(cur.left == null) {
				 Inorder.add(cur);
				 cur = cur.right;
			 }
			 else {
				 TreeNode next = cur.left;
				 while(next.right != null && next.right !=cur) {
					 next = next.right;
				 }
				 if(next.right == null) {
					 next.right =cur;
					 cur =cur.left;
				 }
				 else {
					 next.right = null;
					 Inorder.add(cur);
					 cur = cur.right;
				 }
			 }
		 }
	
		 return Inorder;
	}
	
	
	//Pre-Order
	public List<TreeNode> Preorder(TreeNode root){
		 List<TreeNode> Preorder = new ArrayList<>();
		 TreeNode cur = root;
		 while(cur!=null) {
			 if(cur.left == null) {
				 Preorder.add(cur);
				 cur = cur.right;
			 }
			 else {
				 TreeNode next = cur.left;
				 while(next.right != null && next.right !=cur) {
					 next = next.right;
				 }
				 if(next.right == null) {
					 next.right =cur;
					 Preorder.add(cur);
					 cur =cur.left;
				 }
				 else {
					 next.right = null;
					 cur = cur.right;
				 }
			 }
		 }
	
		 return Preorder;
	}

 
}
