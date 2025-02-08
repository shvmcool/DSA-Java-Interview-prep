package sliding_Two_Pointer;

public class Find_Duplicate_from_array {
	//https://leetcode.com/problems/find-the-duplicate-number/description/
	    public int findDuplicate(int[] nums) {
	        //brute force is 2 nested for loop and 
	        // second brute force is sort the arrya and loop and check for currenet and next number 
	        // make an array and put each number at their respective index 
	        //use floyd detection cycle 
	        int slow = nums[0];
	        int fast = nums[0];
	        do{
	           slow=nums[slow];
	           fast = nums[nums[fast]]; 
	        }
	        while(slow !=fast);
	        fast = nums[0];
	        while(slow!=fast){
	            slow = nums[slow];
	            fast = nums[fast];
	        }
	        return fast;
	    }
	}
