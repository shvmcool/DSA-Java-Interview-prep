package sliding_Two_Pointer;

public class Max_Consecutive_1_III {
	//https://leetcode.com/problems/max-consecutive-ones-iii/description/
	    public int longestOnes(int[] nums, int k) {
	        int start = 0; 
		        int end = 0;
		        int ans = 0;
		        int countZero = 0;
	            for(end=0;end<nums.length;end++){
	                if(nums[end]==0){
	                    ++countZero;
	                }
	                    while(countZero >k){
	                        if(nums[start]==0) countZero--;
	                        start++;
	                    }
	                    ans = Math.max(ans,end-start+1);
	            }
	            return ans;
	    }
	}