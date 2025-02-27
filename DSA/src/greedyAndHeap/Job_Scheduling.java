package greedyAndHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Job_Scheduling {
//http://geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

	    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
	        // code here..
	        ArrayList<Integer> ans = new ArrayList<>();
	        ans.add(0);
	        ans.add(0);
	        ArrayList<ArrayList<Integer> > pairs = new ArrayList<>();
	        for(int i = 0 ; i < profit.length ; i++){
	            ArrayList<Integer> pair = new ArrayList<>();
	            pair.add(profit[i]);
	            pair.add(deadline[i]);
	            pairs.add(pair);
	        }
	        Collections.sort(pairs,(a,b)-> a.get(1)-b.get(1)); // sort on basiss of deadline
	        PriorityQueue<Integer> queue = new PriorityQueue<>();
	        for(int i = 0 ;i < profit.length;i++){
	            if(pairs.get(i).get(1) > queue.size()){
	                queue.add(pairs.get(i).get(0)) ;     //add profit
	            }
	            else if(!queue.isEmpty() && queue.peek() < pairs.get(i).get(0)){
	                queue.poll();
	                queue.add(pairs.get(i).get(0)) ; // As Queue is Min Heap
	            }
	        }
	        
	        while(!queue.isEmpty()){
	            ans.set(0,ans.get(0)+1 );
	            ans.set(1,ans.get(1)+queue.poll());
	        }
	        return ans;
	        
	    }
	}
