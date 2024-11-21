class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int next[]= new int[2], curr[]= new int[2];
        next[0]=next[1]= 0;
        int profit= 0;
        for(int i=n-1; i>=0; i--){
            for(int b= 0; b<2; b++){
                if(b==0) profit= Math.max(0+next[0],-prices[i]+next[1]);
                else profit= Math.max(0+next[1],prices[i]+next[0]);
                curr[b]= profit;
            }
            // System.arraycopy(curr, 0, next, 0, 2);
            next[0]= curr[0];
            next[1]= curr[1];
        }
        return curr[0];
    }
}