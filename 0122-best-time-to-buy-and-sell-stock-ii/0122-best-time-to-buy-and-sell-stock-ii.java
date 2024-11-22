class Solution {
    private int find(int arr[], int n, int[][] dp){
        dp[n][0]=dp[n][1]= 0;
        for(int i=n-1; i>=0; i--){
            int res;
            for(int b=0; b<2; b++){
                if(b==0)
                    // res=Math.max(0+find(arr,i+1,0,n,dp),-arr[i]+find(arr,i+1,1,n,dp));
                    res= Math.max(0+dp[i+1][0],-arr[i]+dp[i+1][1]);
                else
                    // res= Math.max(0+find(arr,i+1,1,n,dp),arr[i]+find(arr,i+1,0,n,dp));
                    res= Math.max(0+dp[i+1][1],arr[i]+dp[i+1][0]);
                dp[i][b]= res;
            }
        }
        return dp[0][0];
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int dp[][]= new int[n+1][2];
        for(int x[] : dp)
            Arrays.fill(x,-1);
        int res= find(prices,n,dp);
        return res;
    }
}