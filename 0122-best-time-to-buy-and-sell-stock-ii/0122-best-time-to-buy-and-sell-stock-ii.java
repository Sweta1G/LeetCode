class Solution {
    
    private int find(int arr[], int i, int b, int n, int[][] dp){
        if(i==n) return 0;
        if(dp[i][b]!=-1) return dp[i][b];
        int res;
        if(b==0)
            res= Math.max(0+find(arr,i+1,0,n,dp),-arr[i]+find(arr,i+1,1,n,dp));
        else
            res= Math.max(0+find(arr,i+1,1,n,dp),arr[i]+find(arr,i+1,0,n,dp));
        dp[i][b]= res;
        return dp[i][b];
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int dp[][]= new int[n][2];
        for(int x[] : dp)
            Arrays.fill(x,-1);
        int res= find(prices,0,0,n,dp);
        return res;
    }
}