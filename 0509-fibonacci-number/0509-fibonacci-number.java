class Solution {
    private int findFib(int n){
        // int first=0, second=1, sum=0, count=0;
        // while(count < n){
        //     int temp= first+second;
        //     first= second;
        //     second= temp;
        //     sum+= temp;
        // }
        int sum=0;
        if(n==0) return 0;
        if(n==1) return 1;
        sum+= findFib(n-1) + findFib(n-2);
        return sum;
    }
    public int fib(int n) {
        // if(n==0 || n==1) return 0;
        // if(n==2) return 1;
        int ans= findFib(n);
        return ans;
        
    }
}