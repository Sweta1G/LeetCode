class Solution {
    private int find(int[] arr, int i, int b, int x, int n, int dp[][][]){
        if(i==n || x==0) return 0;
        if(dp[i][b][x]!=-1) return dp[i][b][x];
        int res;
        if(b==0)
            res= Math.max(0+find(arr,i+1,0,x,n,dp),-arr[i]+find(arr,i+1,1,x,n,dp));
        else
            res= Math.max(0+find(arr,i+1,1,x,n,dp),arr[i]+find(arr,i+1,0,x-1,n,dp));
        dp[i][b][x]= res;
        return dp[i][b][x];
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[][][] dp= new int[n][2][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++)
                Arrays.fill(dp[i][j],-1);
        }
        return find(prices,0,0,2,n,dp);
    }
}