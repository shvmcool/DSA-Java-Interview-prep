package Tree;

public class Minimum_distance_between_nodes {
	   //https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1 
	    int findDist(TreeNode root, int a, int b) {
	        // Your code here
	       
	        
	       int  pathFromRoottoa = findLengthtoNode(root,a);
	       int  pathFromRoottob = findLengthtoNode(root,b);
	       TreeNode LCA = findLCA(root,a,b);
	       int pathFromRoottoLCA = findLengthtoNode(root,LCA.val);
	        return pathFromRoottoa +pathFromRoottob-(2*pathFromRoottoLCA);
	        
	    }
	    
	    public int findLengthtoNode(TreeNode root , int a){
	        if(root == null) return -1;
	        if(root.val == a) return 0;
	        int left =findLengthtoNode(root.left,a);
	        int right =findLengthtoNode(root.right,a);
	        if(left !=-1) return left+1;
	        if(right !=-1) return right+1;
	        return -1;
	    }
	    
	      public TreeNode findLCA(TreeNode root , int a,int b){
	        if(root == null) return null;
	        if(root.val == a || root.val==b){
	            return root;
	        }
	        TreeNode leftTree = findLCA(root.left ,a, b);
	       TreeNode  rightTree = findLCA(root.right,a,b);
	 return leftTree != null && rightTree != null ? root : leftTree!=null?leftTree:rightTree;
	        
	    }
