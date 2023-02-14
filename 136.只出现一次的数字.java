import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // 1、
        // for(int i = 0;i < nums.length;i++){
        //     int count  = 0;
        //     for(int j = 0;j < nums.length;j++){
        //         if(nums[i] == nums[j] && i != j){
        //             count ++;
        //         }
        //     }
        //     if(count == 0){
        //         return nums[i];
        //     }
        // }
        // return 0;
        // 2、
        // 使用异或运算，将所有值进行异或
        // 异或运算，相异为真，相同为假，所以 a^a = 0 ;0^a = a
        // 因为异或运算 满足交换律 a^b^a = a^a^b = b 所以数组经过异或运算，单独的值就剩下了
        // int yh = 0;
        // for(int num:nums){
        //     yh  ^= num;
        // }
        // return yh;
        // 3、
        // 我们遍历数组中的元素，然后在一个个添加到集合Set中，
        // 如果添加失败，说明以前添加过，就把他给移除掉。
        // 当我们把数组中的所有元素都遍历完的时候，
        // 集合Set中只会有一个元素，这个就是我们要求的值。
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return (int)set.toArray()[0];
    }
}
// @lc code=end

