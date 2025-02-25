package greedyAndHeap;

import java.util.PriorityQueue;

public class Kth_weakest_row_in_matrix {
	class Solution {
	    public int[] kWeakestRows(int[][] mat, int k) {
	        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]); // strenter at first in queue
	        int i = 0;
	        int[] ans=new int[k];
	        while (i < mat.length) {
	            queue.add(new int[] { CountOne(mat[i]), i });
	            if (queue.size() > k) {
	                queue.poll();
	            }
	            i++;
	        }
	        while(k>0){
	            ans[--k] = queue.poll()[1];
	        }
	        return ans;

	    }

	    public int CountOne(int[] nums) {
	        int low = 0;
	        int high = nums.length;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (nums[mid] == 1) {
	                low = mid + 1;
	            } else
	                high = mid ;
	        }
	        return low;
	    }
	}
