/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // int length = nums.length;
        // for(int i = 0;i < length;i++){
        //     if(nums[i] == 0){
        //         for(int j = i;j + 1 < length;j++){
        //             nums[j] = nums[j + 1];
        //         }
        //         nums[length - 1] = 0;
        //         if(nums[i] == 0){
        //             for(int k = i;k + 1 < length;k++){
        //                 nums[k] = nums[k + 1];
        //             }
        //             nums[length - 1] = 0; 
        //         }
        //     }
        // }
        if (nums == null || nums.length == 0)
            return;
        int index = 0;
        //一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }
        //后面的都是0,
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
// @lc code=end

