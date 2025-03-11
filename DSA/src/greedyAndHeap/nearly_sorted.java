package greedyAndHeap;

import java.util.PriorityQueue;

public class nearly_sorted {
	//https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1?track=amazon-heap&batchId=192
	    public void nearlySorted(int[] arr, int k) {
	        // code here
	        PriorityQueue<Integer> queue = new PriorityQueue<>();
	        
	        for(int i=0 ; i<arr.length; i++){
	            if(i<k){
	                queue.offer(arr[i]);
	            }
	            else{
	                queue.offer(arr[i]);
	                arr[i-k] = queue.poll();
	            }
	        }
	        
	        while(!queue.isEmpty()){
	            arr[arr.length -k] = queue.poll();
	            k--;
	        }
	    }
}

