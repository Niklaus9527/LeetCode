package OJ038_CountAndSay;

/**
 * Created by zhangyayun on 2017/2/16.
 */
public class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String n1 = countAndSay(n-1);
        StringBuffer result = new StringBuffer();
        int count = 0;
        for(int i = 0; i < n1.length(); i++){
            count++;
            if(i == n1.length()-1 || n1.charAt(i) != n1.charAt(i+1)){
                result.append(count).append(n1.charAt(i));
                count = 0;
            }
        }
        return result.toString();
    }
}
