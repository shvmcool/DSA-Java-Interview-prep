package Arrays;

import java.util.*;

public class subarraySumWithK {

    public int subarraySum(int[] nums, int k) {
        int prefixsum = 0;
         int count = 0;
       Map<Integer,Integer> map = new HashMap<>();
       map.put(0,1); // it signifies that there is 0 sum occur 1 time
       for(int i =0;i < nums.length;i++){
          prefixsum +=nums[i];
          if(map.containsKey(prefixsum-k)){
            count = count + map.get(prefixsum-k);
          }
          if(map.containsKey(prefixsum))
             map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        
       }
       return count;
    }
}
