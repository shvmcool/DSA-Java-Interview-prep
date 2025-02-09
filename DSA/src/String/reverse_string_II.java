package String;

public class reverse_string_II {
//	https://leetcode.com/problems/reverse-string-ii/description/
	    public String reverseStr(String s, int k) {
	        // write your code here
	        int start = 0;
	        StringBuilder ans = new StringBuilder();

	        while (start < s.length()) {
	            int end = Math.min(start + k, s.length());
	            ans.append(reverse(s.substring(start, end)));
	            start += k;
	            if (start < s.length()) {
	                int nextend = Math.min(start + k, s.length());
	                ans.append(s.substring(start, nextend));
	            }

	            start += k;
	        }
	        return ans.toString();

	    }

	    public String reverse(String s) {
	        StringBuilder sb = new StringBuilder(s);
	        return sb.reverse().toString();
	    }
	}
