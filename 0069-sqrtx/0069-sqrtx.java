class Solution {
    public int mySqrt(int x) {
        long start=0, end=x, ans=0;
        while(start<=end){
            long mid= start+(end-start)/2;
            if(mid * mid == x) return (int)mid;
            else if(mid*mid < x){ start= mid+1; ans=mid;}
            else end= mid-1;
        }
        return (int) ans;
        
    }
}