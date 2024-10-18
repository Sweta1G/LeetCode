
class Solution {
    private void backtrack(int[] nums, int[] res, int index, int curr, int maxOr){
        if(curr==maxOr) res[0]++;
        for(int i=index; i<nums.length; i++)
            backtrack(nums,res,i+1,curr|nums[i], maxOr);
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr= 0;
        for(int i: nums)
            maxOr|= i;
        int res[]= new int[1];
        backtrack(nums,res,0,0,maxOr);
        return res[0];
    }
}