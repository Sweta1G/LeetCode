class Solution {
    private boolean isPrime(int x){
        if(x<2) return false;
        
        for(int i=2; i<= Math.sqrt(x); i++)
            if(x%i==0) return false;
        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        int n= nums.length;
        for(int i=0; i<n; i++){
            int bound= i==0? nums[i] : nums[i]-nums[i-1];
            if(bound<=0) return false;
            int largestPrime= 0;
            for(int j= bound-1; j>=2; j--){
                if(isPrime(j)) {largestPrime= j; break;}
            }
            nums[i]-= largestPrime;
        }
        return true;
    }
    // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
}