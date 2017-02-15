package OJ007_ReverseInteger;

/**
 * Created by zhangyayun on 2017/2/10.
 */
public class Solution {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        sb.reverse();
        if(sb.indexOf("-") > -1){
            sb.replace(sb.indexOf("-"), sb.indexOf("-") + 1, "").insert(0, "-");
        }
        try{
            return Integer.parseInt(sb.toString());
        }catch(NumberFormatException e){
            return 0;
        }
    }
}
