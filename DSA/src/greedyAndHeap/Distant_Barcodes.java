package greedyAndHeap;

import java.util.*;

public class Distant_Barcodes {
//https://leetcode.com/problems/distant-barcodes/description/
	    public int[] rearrangeBarcodes(int[] barcodes) {
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i =0 ; i< barcodes.length;i++){
	           map.put(barcodes[i],map.getOrDefault(barcodes[i],0)+1);
	        }
	        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(
	            (a,b)->b.getValue()-a.getValue() == 0?a.getKey()-b.getKey():b.getValue()-a.getValue()
	        );
	         for(Map.Entry<Integer, Integer> entry:map.entrySet())
	            queue.offer(entry);
	            int[] res = new int[barcodes.length];
	        int i = 0;
	        while(!queue.isEmpty()){
	            int k = 2;
	            List<Map.Entry<Integer,Integer>> temp = new ArrayList<>();
	            while(k>0 && !queue.isEmpty()){
	                Map.Entry<Integer, Integer> head = queue.poll();
	                res[i++]=head.getKey();
	                head.setValue(head.getValue()-1);
	                temp.add(head);
	                --k;
	            }
	           for(Map.Entry<Integer,Integer> e:temp){
	            if(e.getValue()>0)
	            queue.add(e);
	           }
	        }
	        return res;
	    }
	}
