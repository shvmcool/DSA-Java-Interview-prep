package sliding_Two_Pointer;

public class BinarySumArray {
//https://leetcode.com/problems/binary-subarrays-with-sum/description/
	public int numSubarraysWithSum(int[] nums, int goal) {
	  // atMost(nums, goal - 1) from atMost(nums, goal),
    // we are effectively removing subarrays whose sum is strictly less than goal. 
   int cnt = sumLessThanEqualtoGoal(nums,goal)-sumLessThanEqualtoGoal(nums,goal-1);
     return cnt;
 }
 public int sumLessThanEqualtoGoal(int [] nums , int goal){
     int start = 0;
     int end = 0;
     int sum = 0;
     int ans = 0;

     for(end =0 ; end <nums.length;end++){
         sum +=nums[end];
         while(sum >goal && start <=end){
              sum-=nums[start++];
         }
        ans = ans+end-start+1;
     }
     return ans;
 }
}
