package Tree;

public class BinaryTree_to_DoublyLinkedlist {
//https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1
    //Function to convert binary tree to doubly linked list and return it.
    TreeNode head = null;
    TreeNode prev = null;
    TreeNode bToDLL(TreeNode root)
    {
	//  Your code here	
	helper(root);
	return head;
    }
    
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(prev == null){
            head = root;
        }
        else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        helper(root.right);
    }
}

