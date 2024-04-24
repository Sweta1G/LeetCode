class Solution {
    public int tribonacci(int n) {
        int dp[]= new int[38];
        dp[0]= 0; dp[1]=1; dp[2]=1;
        
        for(int i=0; i<38-3; i++){
            dp[i+3]= dp[i]+dp[i+1]+dp[i+2];
        }
        return dp[n];
    }
}