/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode();
        for(int i = 0;i < l1.length;i++){
            for(int j = 0;j < l2.length;j++){
                if(l1[i] + l2[j] >= 10){
                    ln[i]
                }
            }
        }
    }
}
// @lc code=end

