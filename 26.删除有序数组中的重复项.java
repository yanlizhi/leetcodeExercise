/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=1;i < nums.length;i++){
            if(nums[i]==nums[i-1]){
                count ++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        return nums.length - count;
    }
}
// @lc code=end

