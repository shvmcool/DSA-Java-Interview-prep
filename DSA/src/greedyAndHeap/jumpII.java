package greedyAndHeap;

public class jumpII {
	//https://leetcode.com/problems/jump-game-ii/
	
	//HERE WE USE WINDOW AND POSITION OUR CURRENT INDEX TO BE FARTHEST WE CAN GO TO END USING
	// VALUE WITHIN THE WINDOW
	    public int jump(int[] nums) {
	    int farthest = 0 ;
	    int jump = 0 ;
	    int currentIndex = 0 ;
	    for(int i = 0 ; i < nums.length - 1; i++){
	       farthest = Math.max(farthest, i+nums[i]);
	       if(currentIndex == i ){
	        jump++;
	        currentIndex = farthest;
	       }
	    }
	    return jump ;
	}
	}


  //Using DYNAMIC-PROGRAMMING TIME LIMIT EXCEEDED
//class Solution {
//    // using dp 
//    public int jump(int[] nums) {
//        int[] ans = {Integer.MAX_VALUE};
//        helper(nums,0,0,ans);
//        return ans[0];
//    }
//
//    public void helper(int[] nums , int index,int jump,int[] ans){
//        if(index == nums.length -1){
//            ans[0] = Math.min(ans[0],jump);
//            return;
//        }
//        for(int i =1 ; index< nums.length -1 && i <=nums[index] ;i++){
//          helper(nums,index+i,jump+1,ans);
//        }
//    
//    }
//}
