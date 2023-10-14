class Solution {
    private int memoization(int index, int walls, int[] cost, int[] time, int dp[][]){
        if(walls <= 0){ 
            return 0;
        }
        if(index < 0 ){ 
            return (int)1e9;
        }
        if(dp[index][walls] != -1){ 
            return dp[index][walls];
        }
        int notTake = 0 + memoization(index - 1, walls, cost, time, dp);
        int take = cost[index] + memoization(index - 1, walls - time[index] - 1, cost, time, dp);
        return dp[index][walls] = Math.min(notTake, take);
    }
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int dp[][] = new int[n][n + 1];
        for(int[]row : dp){
            Arrays.fill(row, -1);
        }
        return memoization(n-1, n, cost, time, dp);
    }
}