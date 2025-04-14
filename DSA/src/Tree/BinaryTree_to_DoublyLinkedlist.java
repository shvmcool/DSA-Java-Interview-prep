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
// when not to use Global variable
//class Solution {
//
//    public Node bToDLL(Node root) {
//        Node[] prev = new Node[1]; // acts like a mutable wrapper
//        return helper(root, prev);
//    }
//
//    private Node helper(Node root, Node[] prev) {
//        if (root == null) return null;
//
//        // Head of the DLL
//        Node head = helper(root.left, prev);
//
//        // If prev is null, we're at the leftmost node
//        if (prev[0] == null) {
//            head = root;
//        } else {
//            prev[0].right = root;
//            root.left = prev[0];
//        }
//
//        // Move prev to current
//        prev[0] = root;
//
//        helper(root.right, prev);
//
//        return head;
//    }
//}

