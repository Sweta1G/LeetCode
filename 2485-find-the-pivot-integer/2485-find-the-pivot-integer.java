class Solution {
    public int pivotInteger(int n) {
        if(n==1) return n;
        
        int t= (n*(n+1))/2;
        int l=0;
        
        for(int i=1;i<=n;i++){
            l+=i;
            if(2*l==t+i)
                return i;
        }
        return -1;
    }
}