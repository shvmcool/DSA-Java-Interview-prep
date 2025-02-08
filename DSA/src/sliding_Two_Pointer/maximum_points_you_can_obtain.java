package sliding_Two_Pointer;

public class maximum_points_you_can_obtain {
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
       
       for(int i = 0 ; i < k ; i++){
          leftSum +=cardPoints[i];
       }
       if(k==n){
        return leftSum;
       }
        int max = leftSum;
       for(int i =0 ; i <k;i++){
        rightSum+=cardPoints[n-1-i];
        leftSum-=cardPoints[k-1-i];
        max = Math.max(max,leftSum+rightSum);
       }
       return max;
    }

}
