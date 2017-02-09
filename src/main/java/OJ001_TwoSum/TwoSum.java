package OJ001_TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyayun on 2017/2/10.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution!");
    }
}
