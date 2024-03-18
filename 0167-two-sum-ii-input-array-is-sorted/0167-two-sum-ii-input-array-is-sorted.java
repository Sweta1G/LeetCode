class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<e){
            if(nums[s]+nums[e]>target) e--;
            else if(nums[s]+nums[e]<target) s++;
            else return new int[]{s+1,e+1};
        }
        return new int[]{};
    }
}