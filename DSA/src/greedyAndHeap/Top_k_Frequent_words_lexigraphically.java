package greedyAndHeap;
import java.util.*;
public class Top_k_Frequent_words_lexigraphically {
//https://leetcode.com/problems/top-k-frequent-words/
	    public List<String> topKFrequent(String[] words, int k) {
	        List<String> res= new ArrayList<>();
	        Map<String,Integer> map = new HashMap<>();
	            for(String s :words){
	                map.put(s,map.getOrDefault(s,0)+1);
	            }
	            PriorityQueue<Map.Entry<String ,Integer>> queue = new PriorityQueue<>((a, b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());
	            for(Map.Entry<String ,Integer> entry:map.entrySet()){
	                 queue.offer(entry);
	                 if(queue.size() > k){
	                    queue.poll();
	                 }
	            }
	           
	             while(!queue.isEmpty()){
	            res.add(queue.poll().getKey());
	            }
	         
	            Collections.reverse(res);
	            return res;
	    }
	}
