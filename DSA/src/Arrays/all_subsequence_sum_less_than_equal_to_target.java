package Arrays;

public class all_subsequence_sum_less_than_equal_to_target {

	    public int numSubseq(int[] nums, int target) {
	        // List<Integer> list = new ArrayList<>();
	        int[] ans = new int[]{0};
	        helper( nums , target , 0 , ans , 0); 
	        return ans[0];
	    }

	    public void helper(int[] nums , int target , int index , int[] ans , int prefixSum){
	        if(index == nums.length){
	               if(prefixSum <= target){
	            ans[0]++;
	        }
	            return ;
	        }
	        prefixSum +=nums[index];
	     
	        helper(nums,target , index+1,ans,prefixSum);
	        prefixSum-=nums[index];
	        helper(nums,target , index+1,ans,prefixSum);
	    }
	}
