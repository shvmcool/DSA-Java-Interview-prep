package sliding_Two_Pointer;

import java.util.*;

public class count_pair_with_diff_K {
	//Count distinct pairs with difference k
  //https://www.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1
    public int TotalPairs(int[] nums, int k) {
        int count = 0;
       if (nums == null || nums.length == 0 || k < 0)   return 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
