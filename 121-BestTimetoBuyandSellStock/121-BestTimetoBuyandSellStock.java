    public int maxProfit(int[] prices){
        int left = 0;
        int right = 1;
        int maximumProfit = 0;
        while(right < prices.length) {
            int profit = prices[right] - prices[left];
            if(prices[right] > prices[left]) {
                maximumProfit = Math.max(profit,maximumProfit);
            } else {
                left = right;
            }
            right+=1;
        }
        return maximumProfit;
    }
}
[
