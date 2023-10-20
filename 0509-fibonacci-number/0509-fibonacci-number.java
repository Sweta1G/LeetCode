class Solution {
    private int findFib(int n){
        int sum=0;
        if(n==0) return 0;
        if(n==1) return 1;
        sum+= findFib(n-1) + findFib(n-2);
        return sum;
    }
    public int fib(int n) {
        // int ans= findFib(n);
        return findFib(n);
        
    }
}