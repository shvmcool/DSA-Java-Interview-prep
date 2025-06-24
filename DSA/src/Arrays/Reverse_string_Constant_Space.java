package Arrays;

public class Reverse_string_Constant_Space {
  // constant space O(1)
	    public String reverseWords(String s) {
	        char[] a = s.toCharArray();
	        int n = a.length;

	        // Step 1: Trim extra spaces and convert to a char array with only one space between words
	        int len = cleanSpaces(a, n);

	        // Step 2: Reverse the whole cleaned array
	        reverse(a, 0, len - 1);

	        // Step 3: Reverse each word
	        int i = 0;
	        for (int j = 0; j <= len; j++) {
	            if (j == len || a[j] == ' ') {
	                reverse(a, i, j - 1);
	                i = j + 1;
	            }
	        }

	        return new String(a, 0, len);
	    }

	    private void reverse(char[] a, int left, int right) {
	        while (left < right) {
	            char temp = a[left];
	            a[left++] = a[right];
	            a[right--] = temp;
	        }
	    }

	    private int cleanSpaces(char[] a, int n) {
	        int i = 0, j = 0;

	        // skip leading spaces
	        while (j < n && a[j] == ' ') j++;

	        while (j < n) {
	            // copy word
	            while (j < n && a[j] != ' ') a[i++] = a[j++];

	            // skip spaces
	            while (j < n && a[j] == ' ') j++;

	            // add one space only if not end
	            if (j < n) a[i++] = ' ';
	        }

	        return i; // new length
	    }
	    
	    
	    //Normal -Solution with extra space String Builder
	    public String reverseWords2(String s) {
	        // Trim spaces and split the string
	        String[] words = s.trim().split("\\s+");

	        // Reverse the array
	        StringBuilder sb = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            sb.append(words[i]);
	            if (i != 0) sb.append(" ");
	        }

	        return sb.toString();
	    }
	}
