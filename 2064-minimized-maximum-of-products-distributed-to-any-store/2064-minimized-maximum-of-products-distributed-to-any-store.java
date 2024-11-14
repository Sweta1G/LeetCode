class Solution {
    private int canDistribute(int[] q, int ln, int n){
        int low= 0, high= -1, res= 0;
        for(int i:q)
            high= Math.max(high,i);
        
        while(low<=high){
            int m= low + (high-low)/2;
            int t= 0;
            for(int qt: q)
                t+= Math.ceil((qt*1.0)/m);
            if(t<=n){
                res= m;
                high= m-1;
            }else
                low= m+1;
        }
        return res;
    }
    public int minimizedMaximum(int n, int[] q) {
        int x= q.length;
        if(x==1) return q[0];
        int res= canDistribute(q,x,n);
        return res;
    }
}