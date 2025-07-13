package Arrays;

public class SpiralMatrixIII {
	
	
	// https://leetcode.com/problems/spiral-matrix-iii/submissions/1696807407/
	    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
	      int [][] ans = new int [rows*cols][2];
	      int [][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};;
	      int steps = 1;
	      int count = 0;
	      int r = rStart, c = cStart;
	      ans[count++] = new int[]{rStart,cStart};

	      while(count <= rows*cols){
	        for (int i = 0 ; i <4 ; i++){
	            for (int j = 0 ; j <steps ; j++){
	            r +=dir[i][0];
	            c +=dir[i][1];
	           if (r >= 0 && r < rows && c >= 0 && c < cols) {
	               ans[count++] = new int[]{rStart,cStart};
	           }
	        }
	        if(i ==1 || i ==3){
	            steps++;
	        }
	      }

	    }
	    return ans;
	}
	}
