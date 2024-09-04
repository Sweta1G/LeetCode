class Solution {
    private static int countSubsetSum(int[] arr, int n, int diff){
        int dp[][]= new int[n+1][diff+1];
        // for(int i=0; i<=n; i++)
        //     dp[i][0]= 1;
        // for(int j=1; j<=diff; j++)
        //     dp[0][j]= 0;
        dp[0][0]= 1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=diff; j++){
                if(arr[i-1]<=j)
                    dp[i][j]= dp[i-1][j-arr[i-1]] + dp[i-1][j];
                else 
                    dp[i][j]= dp[i-1][j];
            }
        }
        return dp[n][diff];
    }
    public int findTargetSumWays(int[] arr, int sum) {
        int n= arr.length;
        
        int total= 0;
        for(int i:arr)
            total+= i;
        if(((total - sum) % 2 == 1) || (sum > total))
            return 0;
        return countSubsetSum(arr,n,(total-sum)/2);
    }
}