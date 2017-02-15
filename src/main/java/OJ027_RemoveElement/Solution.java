package OJ027_RemoveElement;

/**
 * Created by zhangyayun on 2017/2/15.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int n : nums){
            if(n != val){
                nums[i++] = n;
            }
        }
        return i;
    }
}
