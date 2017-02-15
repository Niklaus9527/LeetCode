package OJ013_RomanToInteger;

/**
 * Created by zhangyayun on 2017/2/10.
 */
public class Solution {
    public int romanToInt(String s) {
        int rtn = 0;
        int[] array = new int[s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            switch(s.charAt(i)){
                case 'M' :
                    array[i] = 1000; break;
                case 'D' :
                    array[i] = 500; break;
                case 'C' :
                    array[i] = 100; break;
                case 'L' :
                    array[i] = 50; break;
                case 'X' :
                    array[i] = 10; break;
                case 'V' :
                    array[i] = 5; break;
                case 'I' :
                    array[i] = 1; break;
            }
            if(i != s.length() - 1 && array[i] < array[i+1])
                rtn -= array[i];
            else
                rtn += array[i];
        }
        return rtn;
    }

    public int romanToInt1(String s) {
        int rtn = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'M' :
                    rtn += 1000; break;
                case 'D' :
                    rtn += 500; break;
                case 'C' :
                    if(i < s.length() - 1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        rtn -= 100;
                    else
                        rtn += 100;
                    break;
                case 'L' :
                    rtn += 50; break;
                case 'X' :
                    if(i < s.length() - 1 && (s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L'))
                        rtn -= 10;
                    else
                        rtn += 10;
                    break;
                case 'V' :
                    rtn += 5; break;
                case 'I' :
                    if(i < s.length() - 1 && (s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V'))
                        rtn -= 1;
                    else
                        rtn += 1;
                    break;
                default : return 0;
            }
        }
        return rtn;
    }

}
