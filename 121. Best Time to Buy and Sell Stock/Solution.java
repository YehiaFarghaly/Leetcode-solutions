class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int minValue = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minValue) minValue=prices[i];
            else {
                profit = Math.max(profit,prices[i]-minValue);
            }
        }
        return profit;
    }
}
