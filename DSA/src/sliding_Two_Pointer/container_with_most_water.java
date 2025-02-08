package sliding_Two_Pointer;

public class container_with_most_water {
	    public int maxArea(int[] height) {
	        int start = 0  ;
	        int end = height.length-1;
	        int max = 0 ;
	        while(start<end){
	            int breath = end-start;
	            int length = Math.min(height[start],height[end]);
	             max = Math.max(max,length*breath);
	             //you can also do for optimization;
//	             while(start<end && height[start]<= length) {
//	            	 start++;
//	             }
//	             while(start<end && height[end]<= length) {
//	            	 end--;
//	             }
	            if(height[start]<height[end]){
	                start++;
	            }
	            else{
	                end--;
	            }
	        }
	        return max ;
	    }
	}
