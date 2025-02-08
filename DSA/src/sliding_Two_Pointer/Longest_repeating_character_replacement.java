package sliding_Two_Pointer;

public class Longest_repeating_character_replacement {
//https://leetcode.com/problems/longest-repeating-character-replacement/description/?source=submission-ac
	    public int characterReplacement(String s, int k) {
	        char[] arr = s.toCharArray();
	        int start = 0; 
	        int end = 0;
	        int ans = 0;
	        int mostFreqletter = 0;
	        //using array instaed of map 
	       int[] count = new int[26];
	       
	          for(end =0 ; end <arr.length;end++){
	             count[arr[end]-'A']++;
	             mostFreqletter =Math.max(mostFreqletter, count[arr[end]-'A']);
	             int numOfOtherCharacters = end-start+1 - mostFreqletter;
	             if(numOfOtherCharacters > k){
	                // means its a invalid window as Max we can change k letter only 
	                  count[arr[start]-'A']--;
	                 start ++ ;
	             }
	             ans = Math.max(ans,end-start+1);
	          }
	          return ans;
	    }
	}
