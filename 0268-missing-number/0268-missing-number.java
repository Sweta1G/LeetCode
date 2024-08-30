class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int exp= n*(n+1)/2;
        int act=0;
        for(int i:nums)
            act+=i;
        return Math.abs(exp-act);
    }
}