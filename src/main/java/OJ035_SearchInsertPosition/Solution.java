package OJ035_SearchInsertPosition;

/**
 * Created by zhangyayun on 2017/2/16.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public int searchInsert1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target) return i;
        }
        return nums.length;
    }
}
