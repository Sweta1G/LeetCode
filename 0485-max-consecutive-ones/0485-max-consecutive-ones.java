class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tmp=0, res=0;
        for(int i : nums){
            if(i==0) { res= Math.max(res, tmp); tmp=0;}
            else tmp++;
        }
        res= Math.max(tmp,res);
        return res;
    }
}