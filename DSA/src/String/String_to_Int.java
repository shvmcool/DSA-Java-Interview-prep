package String;

public class String_to_Int {
  
	//https://leetcode.com/problems/string-to-integer-atoi/
	class Solution {
		   public int myAtoi(String s) {
		        int i = 0, n = s.length();
		        // 1. Skip leading whitespaces
		        while (i < n && s.charAt(i) == ' ') {
		            i++;
		        }

		        if (i == n) return 0; // String had only spaces

		        // 2. Handle optional sign
		        int sign = 1;
		        if (s.charAt(i) == '+') {
		            i++;
		        } else if (s.charAt(i) == '-') {
		            sign = -1;
		            i++;
		        }

		        int num = 0;
		        while (i < n && Character.isDigit(s.charAt(i))) {
		            int digit = s.charAt(i) - '0';

		            // 3. Check for overflow/underflow before adding digit
		            if (num > (Integer.MAX_VALUE - digit) / 10) {
		                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		            }

		            num = num * 10 + digit;
		            i++;
		        }

		        return num * sign;
		    }

		}
}
