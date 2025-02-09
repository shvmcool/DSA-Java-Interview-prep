package sliding_Two_Pointer;
import java.util.*;
public class Subarrays_with_K_Different_Integers {
//https://leetcode.com/problems/subarrays-with-k-different-integers/
	    public int subarraysWithKDistinct(int[] nums, int k) {
	       return getAtMostK(nums,k) - getAtMostK(nums,k-1);
	}
	public int getAtMostK(int[] nums,int k ){
	    Map<Integer,Integer> map = new HashMap<>();
	        int start =0 ; 
	        int end =0;
	        int ans = 0;
	   for( end = 0; end <nums.length;end++){
	     map.put(nums[end],map.getOrDefault(nums[end],0)+1);
	     while(map.entrySet().size()>k){
	        map.put(nums[start],map.get(nums[start]) -1);
	        if(map.get(nums[start]) == 0){
	            map.remove(nums[start]);
	        }
	        start++;
	     }
	     ans+=end-start+1;
	   }
	        return ans;
	    }
	}
