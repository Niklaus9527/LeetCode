package OJ020_ValidParentheses;

import java.util.Stack;

/**
 * Created by zhangyayun on 2017/2/13.
 */
public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }
            if(s.charAt(i) == '['){
                stack.push(']');
            }
            if(s.charAt(i) == '{'){
                stack.push('}');
            }
            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(!stack.isEmpty() && stack.pop() == s.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
