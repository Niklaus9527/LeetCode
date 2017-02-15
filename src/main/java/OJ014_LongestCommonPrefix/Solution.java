package OJ014_LongestCommonPrefix;

import java.util.Arrays;

/**
 * Created by zhangyayun on 2017/2/11.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer result = new StringBuffer();
        if(strs != null && strs.length > 0){
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length-1];
            for(int i = 0; i < first.length(); i++){
                if(last.length() > i && last.charAt(i) == first.charAt(i)){
                    result.append(first.charAt(i));
                }else{
                    return result.toString();
                }
            }
        }
        return result.toString();
    }

    public String longestCommonPrefix1(String[] strs) {
        String commonStr = "";
        for(int i = 0; i < strs.length; i++){
            if(i == 0){
                commonStr = strs[i];
                continue;
            }
            if(commonStr == null || commonStr.length() == 0){
                return "";
            }
            int count = commonStr.length() - 1;
            for(; count >= 0; count--){
                if(strs[i].indexOf(commonStr) == 0){
                    continue;
                }
                commonStr = commonStr.substring(0,count);
                if(count == 0){
                    commonStr = "";
                }
            }
        }
        return commonStr;
    }
}
