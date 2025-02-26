package greedyAndHeap;

import java.util.PriorityQueue;

public class Max_product {
//	class Solution {
//	    public int maxProduct(int[] nums) {
//	        int max1 = Integer.MIN_VALUE;
//	        int max2 = Integer.MIN_VALUE;
//
//	        for (int num : nums) {
//	            if (num >= max1) {
//	                max2 = max1;
//	                max1 = num;
//	            } else if (num > max2) {
//	                max2 = num;
//	            }
//	        }
//
//	        return (max1 - 1) * (max2 - 1);
//	    }
//	}
//	            WITH HEAP
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
          queue.offer(num);
        }
        return (queue.poll()-1 ) * (queue.poll()-1);
  }
}
