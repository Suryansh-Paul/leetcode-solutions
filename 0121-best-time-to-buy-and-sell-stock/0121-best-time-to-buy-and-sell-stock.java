class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            cheapest = Math.min(cheapest ,prices[i]);
          int  currentprofit = prices[i]-cheapest;
            maxprofit = Math.max(maxprofit,currentprofit);
        }
        return maxprofit;
        
    }
    
}