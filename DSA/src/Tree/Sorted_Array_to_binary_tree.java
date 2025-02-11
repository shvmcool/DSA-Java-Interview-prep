package Tree;

public class Sorted_Array_to_binary_tree {
	//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedTree(nums,0,nums.length-1);
      }

      public TreeNode sortedTree(int [] nums,int start, int end){
          if(start > end) return null;
          int  mid = start + (end-start)/2;
          TreeNode node = new TreeNode(nums[mid]);
          node.left =sortedTree(nums,start,mid-1);
          node.right = sortedTree(nums, mid+1, end);
          return node;
      }
}
