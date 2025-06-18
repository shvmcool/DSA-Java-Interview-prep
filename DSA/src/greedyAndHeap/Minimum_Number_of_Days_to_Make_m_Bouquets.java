package greedyAndHeap;

public class Minimum_Number_of_Days_to_Make_m_Bouquets {

	//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
	
	class Solution {
	    public int minDays(int[] bloomDay, int m, int k) {
	        int right = 0;
	        int left = Integer.MAX_VALUE;
	        int ans = -1;
	        for (int el : bloomDay) {
	            right = Math.max(right, el);
	            left = Math.min(left, el);
	        }

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (canBloomed(bloomDay, mid, m,k)) {
	                right = mid - 1;
	                ans = mid;
	            } else {
	                left = mid + 1;
	            }
	        }
	        return ans;
	    }
	   // we have to use adjacent flower to make bouquets
	    public boolean canBloomed(int[] bloomDay, int days, int noofbouqutesRequired , int flowerinEachBouquets) {
	        int adjacentFlower = 0;
	        int bouquetMade = 0;
	        for (int el : bloomDay) {
	            if (el <= days) {
	                ++adjacentFlower;
	                if(adjacentFlower == flowerinEachBouquets){
	                      ++bouquetMade;
	                      adjacentFlower = 0;
	                }
	            }
	            else{
	                adjacentFlower = 0;
	            }
	        }
	        if (bouquetMade >= noofbouqutesRequired) {
	            return true;
	        }
	        return false;
	    }
	}
}
