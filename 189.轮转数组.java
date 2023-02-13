/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        // if(nums.length > 1){
        //     int[] newNums = new int[nums.length];
        //     if(nums.length >= k){
        //         for(int i = 0;i < k;i++){
        //             newNums[i] = nums[nums.length - k + i];
        //         }
        //         for(int j = 0;j < nums.length - k;j++){
        //             newNums[k + j] = nums[j];
        //         }
        //         for(int l = 0;l < nums.length;l++){
        //             nums[l] = newNums[l];
        //         }
        //     }else{
        //         for(int i = 0;i < nums.length;i++){
        //             newNums[i] = nums[nums.length - 1 - i];
        //         }
        //         for(int l = 0;l < nums.length;l++){
        //             nums[l] = newNums[l];
        //         }
        //     }
        // }

        // int[] newNums = new int[nums.length];
        // for(int i = 1;i <= k;i++){
        //     newNums[0] = nums[nums.length - 1];
        //     for(int j = 1;j < nums.length;j++){
        //         newNums[j] = nums[j - 1];
        //     }
        //     for(int l = 0; l < nums.length;l++){
        //         nums[l] = newNums[l];
        //     }
        // }

        int length = nums.length;
        int newNums[] = new int[length];
        for(int i = 0;i < length;i++){
            newNums[i] = nums[i];
        }
        for(int i = 0;i < length;i++){
            nums[(i + k)%length] = newNums[i];
        }
    }
}
// @lc code=end

