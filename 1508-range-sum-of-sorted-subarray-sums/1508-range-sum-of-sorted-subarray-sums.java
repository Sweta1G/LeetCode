class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sums[]= new int[n*(n+1)/2], l=0;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+= nums[k];
                }
                if(l<sums.length)
                    sums[l++]= sum;
            }
        }
        Arrays.sort(sums);
        final int mod = (int) 1e9 + 7;
        int ans=0;
    
        for(int i= left-1; i<right; i++){
            ans = (ans + sums[i]) % mod;
        }
        return ans;
    }
}