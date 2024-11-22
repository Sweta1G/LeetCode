class Solution {
    private int find(int arr[], int n){
        int next[]= new int[2], curr[]= new int[2];
        next[0]= next[1]= 0;
        int res;
        for(int i=n-1; i>=0; i--){
            for(int b=0; b<2; b++){
                if(b==0)
                    res= Math.max(0+next[0],-arr[i]+next[1]);
                else
                    res= Math.max(0+next[1],arr[i]+next[0]);
                curr[b]= res;
            }
            next[0]=curr[0];
            next[1]= curr[1];
        }
        return curr[0];
    }
    public int maxProfit(int[] prices) {
        int n= prices.length;;
        int res= find(prices,n);
        return res;
    }
}