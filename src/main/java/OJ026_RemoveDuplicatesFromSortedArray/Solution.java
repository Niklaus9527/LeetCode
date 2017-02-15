package OJ026_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by zhangyayun on 2017/2/13.
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums){
            if(i == 0 || n > nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
    public int removeDuplicates1(int[] nums) {
        Set<Integer> ts = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++){
            ts.add(nums[i]);
        }
        int index = 0;
        Iterator it = ts.iterator();
        while(it.hasNext()){
            nums[index] = (int)it.next();
            index++;
        }
        nums = Arrays.copyOf(nums, ts.size());
        return nums.length;
    }
}
