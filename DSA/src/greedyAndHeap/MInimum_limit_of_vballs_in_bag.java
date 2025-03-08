package greedyAndHeap;

public class MInimum_limit_of_vballs_in_bag {
	//https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/
	    public int minimumSize(int[] nums, int maxOperations) {
	      int left = 1 ;
	      int right = 0;
	      for(int el : nums){
	        right = Math.max(el,right);
	      }
	      while(left<right){
	        int mid = left + (right-left)/2; // it calculates upto which lowest penalty we can go
	        if(canSplit(nums,maxOperations,mid)){
	            right = mid;
	        }
	        else{
	            left = mid+1 ;
	        }
	      }
	      return left; 
	   }
	   public boolean canSplit(int[] nums , int maxoperations,int penalty){
	    int operation = 0;
	    for(int el :nums){
	       if(el > penalty){
	      // we are distributing the balls with higher than our expected penalty to be in different bag  but we still have one bag in which ball comes so -1 is there;
	     // converting el to double because int / int in java will always be floor 
	        operation += (int)Math.ceil((double)el / penalty) -1 ;
	       }
	       if(operation > maxoperations){
	        return false;
	       }
	    }
	    return true;
	   }
	}
