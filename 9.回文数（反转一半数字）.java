/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String y = x + "";
        for(int i = 0;i < y.length();i++){
            if(y.charAt(i) != y.charAt(y.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

