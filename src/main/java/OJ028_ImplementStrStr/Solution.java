package OJ028_ImplementStrStr;

/**
 * Created by zhangyayun on 2017/2/15.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() > haystack.length()){
            return -1;
        }
        for(int i = 0; i <= haystack.length()-needle.length(); i++){
            if(needle.equals(haystack.substring(i,i+needle.length()))){
                return i;
            }
        }
        return -1;
    }
}
