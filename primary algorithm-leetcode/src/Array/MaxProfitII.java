package Array;
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

示例：
输入: [7,1,5,3,6,4]
输出: 7
 */
public class MaxProfitII {
    public int Greedy(int [] nums){
        int profit = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] > nums[i]){
                profit += nums[i+1] - nums[i];
            }
        }
        return profit;
    }
    public int DP(int[] nums){
        int profit = 0;
        return profit;
    }
}
