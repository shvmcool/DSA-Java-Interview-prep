package sliding_Two_Pointer;

public class Longest_substring_with_AtMost_k_distinct_Character {
 //https://www.naukri.com/code360/problems/distinct-characters_2221410
	//https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/
	public static int kDistinctChars(int k, String str) {
		// Write your code here
		int start = 0 ; 
		int end = 0;
		int ans = 0;
		int hashmap[] = new int[128];
		int distinct = 0;
		for( end = 0 ; end< str.length();end++){
          if(hashmap[str.charAt(end)]<=0){
			  distinct++;
		  }
		  hashmap[str.charAt(end)]++;
		  while(distinct>k){
			hashmap[str.charAt(start)]--;
			if(hashmap[str.charAt(start)] == 0) distinct--;
			start++;
		  }
          ans = Math.max(ans,end-start+1);
		}
		return ans;
		
	}

}

