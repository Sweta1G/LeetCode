class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length, max=0,min=prices[0];
        for(int i=1; i<n; i++){
            int x= prices[i]-min;
            max= Math.max(max,x);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}