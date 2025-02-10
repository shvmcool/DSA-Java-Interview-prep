package Number_system;

public class Ugly_Number_II {
	//https://leetcode.com/problems/ugly-number-ii/
	    public int nthUglyNumber(int n) {
	        int[] uglyNo = new int[n];
	        uglyNo[0] = 1; // filling first ugly number
	        // tracking index of i2,i3,i6 to generate all the multiple of 2 , 3, 5 by multiplying it with already inserted ugly numbers
	        int i2 = 0;
	        int i3 = 0;
	        int i5 = 0;
	        int next_multiple_of_2 = 2;
	        int next_multiple_of_3 = 3;
	        int next_multiple_of_5 = 5;
	        for (int i = 1; i < n; i++) {
	            int min = Math.min(Math.min(next_multiple_of_2, next_multiple_of_3), next_multiple_of_5);
	            uglyNo[i] = min;
	            if (min == next_multiple_of_2) {
	                i2++;
	                next_multiple_of_2 = uglyNo[i2] * 2;
	            }
	            if (min == next_multiple_of_3) {
	                i3++;
	                next_multiple_of_3 = uglyNo[i3] * 3;
	            }
	            if (min == next_multiple_of_5) {
	                i5++;
	                next_multiple_of_5 = uglyNo[i5] * 5;
	            }
	        }
	        return uglyNo[n - 1];
	    }
	}
