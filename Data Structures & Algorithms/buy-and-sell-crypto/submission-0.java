class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            minBuy = Math.min(sell, minBuy);
            max = Math.max(max, sell - minBuy);
        }

        return max;
        


    }
}
