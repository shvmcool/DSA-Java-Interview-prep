package greedyAndHeap;

public class k_closest_point_to_origin_QuickSelect {
	//https://leetcode.com/problems/k-closest-points-to-origin/
	    public int[][] kClosest(int[][] points, int k) {
	         quickSelect(points, k-1, 0, points.length - 1);
	         int[][] res = new int[k][2];
	        for (int i = 0; i < k; i++) {
	            res[i] = points[i];
	        }
	        return res;
	    }

	 public void quickSelect(int[][] points, int K,int left , int right){
	    
	     int pivotIndex = helperPartition(points,left,right);
	       if (pivotIndex == K) {
	       return;
	        } 
	        else if (pivotIndex < K) {
	            quickSelect(points, K, pivotIndex + 1, right);
	        } else {
	            quickSelect(points, K, left, pivotIndex - 1);
	        }
	 }

	    public int helperPartition(int[][] points, int left, int right) {
	        int[] pivot = points[left];
	        int pivotdistance = compare(pivot);
	        int i = left + 1;
	        for (int j = left + 1; j <= right; j++) {
	            if (compare(points[j]) < pivotdistance) {
	                swap(points, i, j);
	                i++;
	            }
	        }
	       swap(points, i-1, left);
	       return i-1;
	    }

	    public int compare(int[] p1) {
	        return p1[0] * p1[0] + p1[1] * p1[1];
	    }

	    public void swap(int[][] points, int t, int s) {
	        int[] temp = points[s];
	        points[s] = points[t];
	        points[t] = temp;
	    }
	}
