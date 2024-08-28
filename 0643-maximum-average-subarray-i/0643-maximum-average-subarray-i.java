class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length, i=0, j=0;
        // double res= -1, sum= 0;
        double res = Double.NEGATIVE_INFINITY, sum= 0;

        while(j<n){
            sum+= nums[j];
            if(j-i+1==k){
                res= Math.max(res,sum/k);
                sum-= nums[i];
                i++;
            }
            j++;
        }
        return res;
    }
}