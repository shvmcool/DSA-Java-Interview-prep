package Number_system;

public class Ugly_number {
	//https://leetcode.com/problems/ugly-number/
    public boolean isUgly(int n) {
        if(n==0) return false;
        int[] factors = new int[] {2,3,5};
        for(int factor:factors){
            while(n%factor==0)
            n=n/factor;
        }
        return n==1;
    }
}
