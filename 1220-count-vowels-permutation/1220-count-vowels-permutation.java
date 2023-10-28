class Solution {
    
int MOD = 1000000007;
    public int countVowelPermutation(int n) {
        Map<Integer, List<Integer>> validRules = new HashMap<>();
    
    validRules.put(1, Arrays.asList(2));
    validRules.put(2, Arrays.asList(1, 3));
    validRules.put(3, Arrays.asList(1, 2, 4, 5));
    validRules.put(4, Arrays.asList(3, 5));
    validRules.put(5, Arrays.asList(1));
    
    int result = 0;
    
    int[][] dp = new int[6][n+1];
    
    for( int i = 0; i < dp.length; i++ ) Arrays.fill(dp[i], -1);
    
    for( int c : validRules.keySet() ){
        result = (result + dfs(c, n, validRules, dp))%MOD;
    }
    
    return result;
    
}

private int dfs( int c, int n, Map<Integer, List<Integer>> validRules, int[][] dp ){
    
    if( n == 1 ) return 1;
    
    if( dp[c][n] != -1 ) return dp[c][n];
    
    int result = 0;
    
    for( int ch : validRules.get(c) ){
        result = (result + dfs(ch, n-1, validRules, dp))%MOD;
    }
    
    return dp[c][n] = result;
    }
}