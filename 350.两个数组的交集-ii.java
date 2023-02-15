import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 1、
        // ArrayList<Integer> newNum = new ArrayList<>();
        // for(int i = 0;i < nums1.length;i++){
        // for(int j = 0;j < nums2.length;j++){
        // if(nums1[i] == nums2[j]){
        // newNum.add(nums1[i]);
        // nums2[j] = 0;
        // break;
        // }
        // }
        // }
        // int[] newNum2 = new int[newNum.size()];
        // for(int i = 0;i < newNum.size();i++){
        // newNum2[i] = newNum.get(i);
        // }
        // return newNum2;
        // 2、
        // 1，先对数组进行排序
        // 先对两个数组进行排序，然后使用两个指针，分别指向两个数组开始的位置。

        // 如果两个指针指向的值相同，说明这个值是他们的交集，就把这个值加入到集合list中，然后两个指针在分别往后移一步。
        // 如果两个指针指向的值不同，那么指向的值相对小的往后移一步，相对大的先不动，然后再比较
        // 先对两个数组进行排序
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int i = 0;
        // int j = 0;
        // List<Integer> list = new ArrayList<>();
        // while (i < nums1.length && j < nums2.length) {
        //     // 如果i指向的值小于j指向的值，，说明i指向
        //     // 的值小了，i往后移一步
        //     if(nums1[i] < nums2[j]){
        //         i++;
        //     }else if(nums1[i] > nums2[j]){
        //         // 如果i指向的值大于j指向的值，说明j指向的值
        //         // 小了，j往后移一步
        //         j++;
        //     }else{
        //          // 如果i和j指向的值相同，说明这两个值是重复的，
        //         // 把他加入到集合list中，然后i和j同时都往后移一步
        //         list.add(nums1[i]);
        //         i++;
        //         j++;
        //     }
        // }
        // //把list转化为数组
        // int[] newNum = new int[list.size()];
        // for(int k = 0;k < list.size();k++){
        //     newNum[k] = list.get(k);
        // }
        // return newNum;
        // 3、使用map解决
        // 还可以使用map来解决，具体操作如下

        // 遍历nums1中的所有元素，把它存放到map中，其中key就是nums1中的元素，value就是这个元素在数组nums1中出现的次数。

        // 遍历nums2中的所有元素，查看map中是否包含nums2的元素，如果包含，就把当前值加入到集合list中，然后对应的value要减1。
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //先把数组nums1的所有元素都存放到map中，其中key是数组中
        //的元素，value是这个元素出现在数组中的次数
        for(int num:nums1){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        //然后再遍历nums2数组，查看map中是否包含nums2的元素，如果包含，
        //就把当前值加入到集合list中，然后再把对应的value值减1。
        for(int i = 0;i < nums2.length;i++){
            if(hashMap.getOrDefault(nums2[i], 0)>0){
                list.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) - 1);
            }
        }
        //把集合list转化为数组
         int[] newNum = new int[list.size()];
        for(int k = 0;k < list.size();k++){
            newNum[k] = list.get(k);
        }
        return newNum;
    }
}
// @lc code=end
