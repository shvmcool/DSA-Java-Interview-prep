package Tree;
//https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/description/
public class Number_of_good_node {
	    int count=0;
	    public int countPairs(TreeNode root, int distance) {
	         dfs(root,distance);
	         return count ;
	    }
	    public int[] dfs(TreeNode root ,int  distance){
 int[] arr = new int [11]; // here each index represnt the distance and its value is no. of leaf node
  // so if(arr[2]=1) it means 1 leaf node at distance 2 ;
	             if(root == null) return arr;
	             if(root.left == null && root.right == null){
	                 arr[1]=1;
	                 return arr;
	             }
	             int[] left = dfs(root.left,distance);
	             int[] right = dfs(root.right,distance);
	             
	             for(int i = 1; i<=distance ; i++){
	                for(int j = 1; j <=distance - i ; j++){
	                     count+=left[i] * right[j];
	                }
	             }

	             for(int i = 2;i<11;i++){
	                arr[i]=left[i-1] +right[i-1];
	             }
	             return arr;
	    }
	}
