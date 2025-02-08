package sliding_Two_Pointer;

public class countnoofnicesubarray {
	//https://leetcode.com/problems/count-number-of-nice-subarrays/description/
    public int numberOfSubarrays(int[] nums, int k) {
      
       int cnt = cntOddLessThanEqualtoK(nums,k)-cntOddLessThanEqualtoK(nums,k-1);
        return cnt;
    }

        public int cntOddLessThanEqualtoK(int [] nums , int k){
        int start = 0;
        int end = 0;
        int cnt = 0;
        int ans = 0;

        for(end =0 ; end <nums.length;end++){
            // so we make it  0 and 1 by doing below .
            cnt +=nums[end] %2;
            while(cnt >k && start <=end){
                 cnt-=nums[start++] %2;
            }
           ans = ans+end-start+1;
        }
        return ans;
    }
}
