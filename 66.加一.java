import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        // long a = 0;
        // long sum = 0;
        // int length = digits.length;
        // for (int i = 0; i < length;i++) {
        // a += (long) (digits[length - 1 - i] * (Math.pow(10, i)));
        // System.out.println(a);
        // }
        // sum = a + 1;
        // String sumStr = sum + "";
        // char[] sumChar = sumStr.toCharArray();
        // int[] newNum = new int[sumChar.length];
        // for (int i = 0; i < sumChar.length; i++) {
        // newNum[i] = sumChar[i] - '0';
        // }
        // return newNum;

        // if(sum % (int)(Math.pow(10, length + 1)) != sum){
        // for(int i = 0;i < length;i++){
        // list.add((int)(sum % (Math.pow(10, i + 1))));
        // }
        // int[] newNum = new int[length];
        // for(int i = 0;i < length;i++){
        // newNum[i] = list.get(i);
        // }
        // return newNum;
        // }else{
        // for(int i = 0;i < length + 1;i++){
        // list.add((int)(sum % (Math.pow(10, i))));
        // }
        // int[] newNum = new int[length + 1];
        // for(int i = 0;i < length + 1;i++){
        // newNum[i] = list.get(i);
        // }
        // return newNum;
        // }
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                // 如果数组当前元素不等于9，直接加1
                // 然后直接返回
                digits[i]++;
                return digits;
            } else {
                // 如果数组当前元素等于9，那么加1之后
                // 肯定会变为0，我们先让他变为0
                digits[i] = 0;
            }
        }
        // 除非数组中的元素都是9，否则不会走到这一步，
        // 如果数组的元素都是9，我们只需要把数组的长度
        // 增加1，并且把数组的第一个元素置为1即可
        int newNUm[] = new int[length + 1];
        newNUm[0] = 1;
        return newNUm;
    }
}
// @lc code=end
