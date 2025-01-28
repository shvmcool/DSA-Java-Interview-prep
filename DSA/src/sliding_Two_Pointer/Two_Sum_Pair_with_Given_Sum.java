package sliding_Two_Pointer;

import java.util.*;

public class Two_Sum_Pair_with_Given_Sum {
	  boolean twoSum(int arr[], int target) {
	        // code here
	        Map<Integer , Integer> map = new HashMap<>();
	        for(int i = 0 ; i < arr.length;i++){
	            int c= target-arr[i];
	            if(map.containsKey(c)){
	                return true;
	            }
	            map.put(arr[i],i);
	        }
	        return false;
	    }
}
