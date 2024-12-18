class Solution {
    private int findNext(int arr[], int x, int n, int t){
        for(int i=x; i<n; i++){
            if(arr[i]<=t) return arr[i];
        }
        return 0;
    }
    public int[] finalPrices(int[] prices) {
        int n= prices.length;
        for(int i=0; i<n-1 ;i++){
            int x= findNext(prices, i+1, n, prices[i]);
            prices[i]-=x;
        }  
        return prices;
    }
}