package sliding_Two_Pointer;
import java.util.*;
public class Longest_substring_without_repeating_characters {
	//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
	    public int lengthOfLongestSubstring(String s) {
	        int max = 0;
	        Set<Character> set = new HashSet<>();
	        int i =0 ; 
	        int j = 0;
	        while(i<s.length()){
	            if(set.contains(s.charAt(i))){
	                set.remove(s.charAt(j++));
	            }
	            else{
	             set.add(s.charAt(i++));
	            }
	            max = Math.max(max,set.size());
	        }
	        return max;
	    }
	}
