/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */
/* 贪心算法是指，在对问题求解时，总是做出在当前看来是最好的选择。也就是说，不从整体最优上加以考虑，算法得到的是在某种意义上的局部最优解。



那么这道题使用贪心算法也是最容易解决的，只要是上涨的我们就要计算他们的差值进行累加，不需要再找开始上涨的最小值和最大值。为什么能这样计算，我举个例子。



比如a<b<c<d，因为从a到d一直是上涨的，那么最大值和最小值的差值就是d-a，也可以写成(b-a)+(c-b)+(d-c)，搞懂了这个公式所有的一切都明白了。如果还不明白，可以想象成数组中前一个值减去后一个值，构成一个新的数组，我们只需要计算这个新数组中正数的和即可
 */


// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // 1.
       /* if(prices == null || prices.length < 2){
            return 0;
       }
       int total = 0,index = 0,length = prices.length;
       while(index < length){
           //如果股票下跌就一直找，直到找到股票开始上涨为止
        while(index < length -1 && prices[index] > prices[index + 1]){
            index ++;
        }
        //股票上涨开始的值，也就是这段时间上涨的最小值
        int min = prices[index];
        //一直找到股票上涨的最大值为止
        while(index < length -1 && prices[index] <= prices[index + 1]){
            index ++;
        }
        //计算这段上涨时间的差值，然后累加
        total += prices[index++] - min;
       }
       return total; */
    //    2.
       /* int total = 0;
       for(int i=1;i<prices.length;i++){
        //原数组中如果后一个减去前一个是正数，说明是上涨的，
        //我们就要累加，否则就不累加
        total += Math.max(prices[i] - prices[i-1],0);
       }
       return total;
    } */
    // 3.
    // 给定四个参数，日期，买入价，盈利，当前交易状态
    int day = 0, price = 0, sum = 0;
    boolean buy = false;
    // 对每天价格做比较
    while(day < prices.length - 1) {
            // 假如第二天的价格比第一天高
            if(prices[day] < prices[day+1]) {
                // 并且我们没有买股票
                if(!buy) {
                    // 那此时我们买入第一天的价格
                    buy = true;
                    price = prices[day];
                }
                //倒数前一天已经买入情况
                if(buy && prices.length-1 == day+1){
                    sum += prices[day+1] - price;
                    buy = false;
                }
                // 如果买入了，那就继续持有
            }
            // 假如第二天比第一天低
            else {
                // 并且我们已经买入
                if(buy) {
                    // 那我们按照当前的价格卖出，并加入盈利
                    buy = false;
                    sum += prices[day] - price;
                }
                // 如果没买，那我们就等后面一天看情况是否买入
            }
        day++;
    }
    return sum;
}
}
// @lc code=end

