package OJ009_PalindromeNumber;

/**
 * Created by zhangyayun on 2017/2/10.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        int old = x;
        int now = 0;
        while(x > 0){
            now = now * 10 + x % 10;
            x = x / 10;
        }
        return old == now;
    }
    public boolean isPalindrome2(int x) {
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        String old = sb.toString();
        String now = sb.reverse().toString();
        if(old != null && old.equals(now)){
            return true;
        }
        return false;
    }
}
