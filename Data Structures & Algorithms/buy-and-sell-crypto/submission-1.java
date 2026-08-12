class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int profit = 0;

        for (int sell : prices) {
            minBuy = Math.min(minBuy, sell);
            profit = Math.max(profit, sell - minBuy);
        }

        return profit;
    }
}
