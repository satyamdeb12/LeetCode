class Solution {
    public int maxProfit(int[] prices){
        int leastSoFar = Integer.MAX_VALUE;
        int profitIfSoldToday = 0;
        int maximumProf = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }
            profitIfSoldToday = prices[i] - leastSoFar;
            if(maximumProf < profitIfSoldToday) {
                maximumProf = profitIfSoldToday;
            }
        }
        return maximumProf;
    }
}
