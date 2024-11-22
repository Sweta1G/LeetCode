class Solution {
    private int find(int[] arr,int n){
        int next[][]= new int[2][3], curr[][]= new int[2][3];
        int res;
        for(int i=n-1; i>=0; i--){
            for(int b=0; b<2; b++){
                for(int x=1; x<3; x++){
                    if(b==0)
                        res= Math.max(0+next[0][x],-arr[i]+next[1][x]);
                    else
                        res= Math.max(0+next[1][x],arr[i]+next[0][x-1]);
                    // dp[i][b][x]= res;
                    curr[b][x]= res;
                }
            }
            for(int z= 0; z<2; z++){
                next[z][0]= curr[z][0];
                next[z][1]= curr[z][1];
                next[z][2]= curr[z][2];
            }
        }
        
        return next[0][2];
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        // int[][][] dp= new int[n+1][2][3];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<2; j++)
        //         Arrays.fill(dp[i][j],-1);
        // }
        return find(prices,n);
    }
}