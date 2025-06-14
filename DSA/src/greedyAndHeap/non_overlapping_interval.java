package greedyAndHeap;

import java.util.Arrays;

public class non_overlapping_interval {
	    public int eraseOverlapIntervals(int[][] intervals) {
	        Arrays.sort(intervals,(a,b)->a[1]-b[1]); // sorting on the ending time
	         int end = intervals[0][1];
	         int ans = 0 ;
	         for(int i =1 ; i < intervals.length; i++){
	            if(intervals[i][0] <end ){
	                ans++;
	            }
	            else{
	                end = intervals[i][1];
	            }
	         }
	         return ans;
	    }
	}
// When we use Greedy ? 
//Sorting by End Time → Optimal Choice
//If we sort the intervals by their end time, we can always keep the interval that ends the earliest.
//This is a greedy choice because it leaves the most room for upcoming intervals.

//If it does overlap, remove the current interval,
//since keeping the one with the earliest end time is the greedy choice.