package greedyAndHeap;

import java.util.Arrays;

public class N_meeting_in_room {
  //https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
	    // Function to find the maximum number of meetings that can
	    // be performed in a meeting room.
	    public int maxMeetings(int start[], int end[]) {
	        // add your code here
	        int ans = 1;
	        int[][] arr = new int[start.length][2];
	        for(int i = 0 ; i <start.length; i++){
	            arr[i][0]= start[i];
	             arr[i][1]= end[i];
	        }
	        
	        Arrays.sort(arr,(a,b)->a[1]-b[1]);
	        int last = arr[0][1];
	        for(int i = 1 ; i < arr.length;i++){
	            if(last < arr[i][0]){
	                ans++;
	                last = arr[i][1];
	            }
	        }
	        return ans;
	    }
	}
