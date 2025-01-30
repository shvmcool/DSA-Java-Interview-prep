package sliding_Two_Pointer;

import java.util.*;

public class Find_all_anagram_in_string {
	    public List<Integer> findAnagrams(String s, String p) {
	           List<Integer> ans = new ArrayList<>();
	       if (s.length() < p.length()) return ans;
	     
	        Map<Character, Integer> pmap = new HashMap<>();
	        Map<Character, Integer> windowmap = new HashMap<>();
	        int windowsize = p.length();
	        for (int i = 0; i < p.length(); i++) {
	          pmap.put(p.charAt(i), pmap.getOrDefault(p.charAt(i), 0) + 1);
	        }
	        for (int i = 0; i < windowsize; i++) {
	          windowmap.put(s.charAt(i), windowmap.getOrDefault(s.charAt(i), 0) + 1);
	        }
	        for(int i = 0 ; i <= s.length()-windowsize;i++){
	            if(pmap.equals(windowmap)){
	                ans.add(i);
	            }
	            if(i+windowsize <s.length()){
	                char startChar = s.charAt(i);
	                char endChar = s.charAt(i+windowsize);

	                windowmap.put(startChar,windowmap.get(startChar)-1);
	                 if (windowmap.get(startChar) == 0) {
	                    windowmap.remove(startChar);
	                }
	                 windowmap.put(endChar, windowmap.getOrDefault(endChar, 0) + 1);
	            }
	        }
	         
	   
	        return ans;
	    }

	    // public boolean isAnagram(Map<Character, Integer> map1, String temp) {
	    //       Map<Character, Integer> map2 = new HashMap<>();
	    //    for (int i = 0; i < temp.length(); i++) {
	    //     map2.put(temp.charAt(i), map2.getOrDefault(temp.charAt(i), 0) + 1);
	    //     }
	    //     //using stream java
	    //     return map1.entrySet().stream()
	    //                .allMatch(e->e.getValue().equals(map2.get(e.getKey())));
	    // }
	}
