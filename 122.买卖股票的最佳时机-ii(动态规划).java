/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */
/* 动态规划解决
定义dp[i][0]表示第i天交易完之后手里没有股票的最大利润，dp[i][1]表示第i天交易完之后手里持有股票的最大利润。



当天交易完之后手里没有股票可能有两种情况，一种是当天没有进行任何交易，又因为当天手里没有股票，所以当天没有股票的利润只能取前一天手里没有股票的利润。一种是把当天手里的股票给卖了，既然能卖，说明手里是有股票的，所以这个时候当天没有股票的利润要取前一天手里有股票的利润加上当天股票能卖的价格。这两种情况我们取利润最大的即可，所以可以得到

dp[i][0]=max(dp[i-1][0],dp[i-1][1]+prices[i]);



当天交易完之后手里持有股票也有两种情况，一种是当天没有任何交易，又因为当天手里持有股票，所以当天手里持有的股票其实前一天就已经持有了。还一种是当天买入了股票，当天能买股票，说明前一天手里肯定是没有股票的，我们取这两者的最大值，所以可以得到

dp[i][1]=max(dp[i-1][1],dp[i-1][0]-prices[i]);



动态规划的递推公式有了，那么边界条件是什么，就是第一天

如果买入：dp[0][1]=-prices[0];

如果没买：dp[0][0]=0;
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }
        int length = prices.length;
        int [][] dp = new int[length][2];
        //初始条件
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i = 1;i < length;i++){
            //递推公式
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
        } 
        //最后一天肯定是手里没有股票的时候，利润才会最大，
        //只需要返回dp[length - 1][0]即可
        return dp[length - 1][0];
    }
}
// @lc code=end

