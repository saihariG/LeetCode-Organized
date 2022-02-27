package Arrays;

public class BuySellStock {
    public int maxProfit(int[] prices) {

        int buy = 0 , sell = buy + 1 , maxProfit = 0;

        while(sell < prices.length) {
            // profitable ?
            if(prices[buy] < prices[sell]) {
                int currProfit = prices[sell] - prices[buy];
                maxProfit = Math.max(currProfit,maxProfit);
            }
            else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
