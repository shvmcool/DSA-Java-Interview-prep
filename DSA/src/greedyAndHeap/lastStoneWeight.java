package greedyAndHeap;

import java.util.Collections;
import java.util.*;

public class lastStoneWeight {
	//https://leetcode.com/problems/last-stone-weight/
	    public int lastStoneWeight(int[] stones) {
	        int i = 0;
	        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
	        while(i< stones.length){
	            queue.add(stones[i++]);
	        }
	        while(queue.size() !=1 && !queue.isEmpty()){
	            int x = queue.poll();
	            int y = queue.poll();
	            if(x!=y){
	                queue.add(x-y);
	            }
	        }
	        if(queue.size()==1){
	            return queue.poll();
	        }
	        return 0 ;
	    }
	}
