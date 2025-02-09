package String;

public class Magical_String {
//https://leetcode.com/problems/magical-string/description/
    public int magicalString(int n) {
        //write your code here
        if (n <= 3) return 1; // "122" starts with one '1'
        StringBuilder s = new StringBuilder("122");
        int head = 2;
        int countOne = 1;
        int num = 1;
        while (s.length() < n){
            int repeatCount = s.charAt(head++) -'0';
            for(int i =0; i<repeatCount;i++){
                s.append(num);
                if(num ==1 && s.length()<=n){
                    countOne++;
                }
            }
            num = num==1? 2:1;
        }
        return countOne;
    }
}
