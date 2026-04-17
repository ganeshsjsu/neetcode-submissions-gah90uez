class Solution {
    public int maxProfit(int[] prices) {
        int currmin = prices[0];
        int max_profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(currmin < prices[i]) {
                max_profit = Math.max(max_profit, prices[i] - currmin);
            }
            currmin = Math.min(currmin, prices[i]);
        }
        return max_profit;
    }
}
