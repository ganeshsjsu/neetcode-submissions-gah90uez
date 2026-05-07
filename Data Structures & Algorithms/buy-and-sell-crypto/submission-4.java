class Solution {
    public int maxProfit(int[] prices) {
        int currmin = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] < currmin) {
                currmin = prices[i];
            }
            else {
                max = Math.max(max, prices[i] - currmin);
            }
        }

        return max;
    }
}
