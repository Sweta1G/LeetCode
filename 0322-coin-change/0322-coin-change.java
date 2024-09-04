class Solution {
    public int coinChange(int[] arr, int target) {
        int n= arr.length;
        int dp[][]= new int[n+1][target+1];

        for(int j=1; j<=target; j++)        // Row 1- Initiallize
            dp[0][j]= Integer.MAX_VALUE-1;

        for(int i=1; i<=n; i++)             // Col 1- Initialize
            dp[i][0]= 0;

        for(int j=1; j<=target; j++){       // Row 2- Initialize
            if(j%arr[0]==0) 
                dp[1][j]= j/arr[0];
            else
                dp[1][j]= Integer.MAX_VALUE-1;
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<=target; j++){
                if(arr[i-1]<=j)
                    dp[i][j]= Math.min(1+ dp[i][j-arr[i-1]],dp[i-1][j]);
                
                else
                    dp[i][j]= dp[i-1][j];
            }
        }
        if(dp[n][target]==2147483646) return -1;
        return dp[n][target];
    }
}