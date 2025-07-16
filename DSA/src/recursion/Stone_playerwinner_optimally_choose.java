package recursion;

public class Stone_playerwinner_optimally_choose {
  
	//https://leetcode.com/problems/stone-game/

	    public boolean stoneGame(int[] piles) {
	        
	         Integer[][] dp =new Integer [piles.length][piles.length];
	        return helper(piles,0 ,piles.length -1,dp) >0;
	    }

	    public int helper(int[] piles , int left , int right , Integer [][]dp){
	        if(left == right){
	            return piles[left];
	        }
	        if(dp[left][right] != null){
	            return dp[left][right];
	        }
	     // We pick each possible choice and subtract the opponent's best possible pick from it,
	     // because both players are playing optimally.
	     // After all recursive calls, if the final result (difference) is positive,
	     // it means Player 1's score is higher than Player 2's score,
	     // so Player 1 can win the game.
	      int pickleft = piles[left]-helper(piles,left+1,right,dp);
	      int pickright = piles[right]-helper(piles,left,right-1,dp);
	      dp[left][right]= Math.max(pickleft,pickright);
	      return dp[left][right];

	    }

	}
