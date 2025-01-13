package Arrays;

public class Lcm_GCD {
	  public static int[] lcmAndGcd(int a, int b) {
	        // code here
	        int gcd = getGCD(a,b);
	        int lcm = (a*b)/gcd;
	        return  new int[]{lcm,gcd};
	    }
	    
	    public  static int getGCD(int a , int b){
	        int gcd = 1 ;
	        while(a>0 && b>0){
	            if(a<b){
	                b= b%a;
	            }
	            else{
	                a=a%b;
	            }
	        }
	        if(a == 0){
	            return b;
	        }
	        return a;
	    }
}
