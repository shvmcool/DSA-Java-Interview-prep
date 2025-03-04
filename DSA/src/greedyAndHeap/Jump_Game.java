package greedyAndHeap;

public class Jump_Game {
    // using dp
    public boolean canJump(int[] nums) {
          int n = nums.length;
    boolean[] dp = new boolean[n]; // dp[i] = true if we can reach index i
    dp[0] = true; // Start position is always reachable

    for (int i = 0; i < n; i++) {
        if (dp[i]) { // If index `i` is reachable
            for (int j = 1; j <= nums[i] && i + j < n; j++) {
                dp[i + j] = true; // Mark next positions as reachable
            }
        }
    }
    return dp[n - 1]; // Check if the last index is reachable
    }
    
    //USING GREEDY	
    public boolean canJump2(int[] nums) {
        int n = nums.length;
        int farthest = 0; // take note of farthest it can go 
        for(int i =0; i <n;i++){
          if(i  >farthest) return false;
          farthest = Math.max(farthest , i +nums[i]);
        }
   
}
