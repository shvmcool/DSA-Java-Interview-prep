package sliding_Two_Pointer;
import java.util.*;
public class Minimun_window_substring {
//https://leetcode.com/problems/minimum-window-substring/
	    public String minWindow(String s, String t) {
	        int start = 0;
	        int end = 0;
	        String ans = "";
	        int minlength = Integer.MAX_VALUE;
	        Map<Character, Integer> map = new HashMap<>();
	        for (char c : t.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        int countOfT = 0;
	        for (end = 0; end < s.length(); end++) {

	            if (map.getOrDefault(s.charAt(end), 0) > 0)
	                countOfT++;
	            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) - 1);

	            while (countOfT == t.length()) {
	                if (end - start + 1 < minlength) {
	                    ans = s.substring(start, end + 1);
	                    minlength = end - start + 1;
	                }

	                char startingIndexCharacter = s.charAt(start);
	                map.put(startingIndexCharacter, map.get(startingIndexCharacter) + 1);
	                if (map.get(startingIndexCharacter) > 0)
	                    countOfT--;
	                start++;

	            }
	        }
	        return ans;
	    }
	}

 //using only array without map useing the propetry of char converting to its ascii value 
class Solution {
    public String minWindow(String s, String t) {
        char[] sourceChars = s.toCharArray();
        char[] targetChars = t.toCharArray();
        int start = 0;
        int end = 0;
        int startIndex = 0;
        int unmatchedCount = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int[] charFrequency = new int[128];
        for (char c : targetChars) {
            unmatchedCount++;
            charFrequency[c]++;
        }
        while (end < sourceChars.length) {
            if (charFrequency[sourceChars[end]] > 0) {
                unmatchedCount--;
            }
            charFrequency[sourceChars[end]]--;
            end++;
            while (unmatchedCount == 0) {
                if (end - start < minWindowSize) {
                    minWindowSize = end - start;
                    startIndex = start;
                }
                if (charFrequency[sourceChars[start]] == 0) {
                    unmatchedCount++;
                }
                charFrequency[sourceChars[start]]++;
                start++;
            }
        }
        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minWindowSize);
    }
}
