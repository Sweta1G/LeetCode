class Solution {
    private int find(int[] arr,int n, int dp[][][]){
        
        
        int res;
        for(int i=n-1; i>=0; i--){
            for(int b=0; b<2; b++){
                for(int x=1; x<3; x++){
                    if(b==0)
                        res= Math.max(0+dp[i+1][0][x],-arr[i]+dp[i+1][1][x]);
                    else
                        res= Math.max(0+dp[i+1][1][x],arr[i]+dp[i+1][0][x-1]);
                    dp[i][b][x]= res;
                }
            }
        }
        
        return dp[0][0][2];
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[][][] dp= new int[n+1][2][3];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<2; j++)
        //         Arrays.fill(dp[i][j],-1);
        // }
        return find(prices,n,dp);
    }
}