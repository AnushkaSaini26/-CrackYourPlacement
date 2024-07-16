class Solution {
    public int maxProfit(int[] prices) {
        
  int l=prices.length;

  int maxProfit = 0;
  int min=Integer.MAX_VALUE;
 
  for(int i=0; i<l; i++) {
   min= Math.min(min, prices[i]);
    maxProfit = Math.max(maxProfit, prices[i]-min);
    }
return maxProfit;
    }
}
