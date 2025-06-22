package Arrays;

import java.util.Arrays;
//https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
public class Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition {
	    public int numSubseq(int[] nums, int target) {
	        // List<Integer> list = new ArrayList<>();
	        long mod = (long) 1e9 +7;
	        Arrays.sort(nums);
	        int res =0;

	        int left = 0; int right =  nums.length -1;
	        while(left <= right){
	            if(nums[left]  + nums[right]  <= target){
	               res=(int)((res + pow(2,(long)right-left ,mod) ) %mod);
	               left++;
	            }
	            else{
	                right-- ;
	            }
	        }
	         return res;
	        // helper( nums , target , 0 , ans , Integer.MAX_VALUE, Integer.MIN_VALUE ,false); 
	        // return ans[0];
	    }

	    public int pow(long a , long n ,long mod ){
	        long res =1;
	        while(n !=0){
	        if(n %2 ==1){
	                    res=(res*a) %mod;
	                    n= n-1;
	                }
	                else{
	                    a=(a*a) %mod;
	                    n=n/2;
	                }
	        }
	        return (int)res;
	    }
	    // using below time limit is exceeding

	    // public void helper(int[] nums , int target , int index , int[] ans , int min ,  int max , boolean hasTaken){
	    //     if(index == nums.length){
	    //            if(min+max <= target && hasTaken){
	    //         ans[0]++;
	    //     }
	    //         return ;
	    //     }

	    //     if(min + max > target  && hasTaken){
	    //         return;
	    //     }

	    //     helper(nums,target , index+1,ans,Math.min(min,nums[index]),Math.max(max,nums[index]),true);
	    //     helper(nums,target , index+1,ans,min,max ,hasTaken);
	    // }
	}
