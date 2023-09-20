class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int num : nums) target += num;

        if(target==0) return nums.length;

        int sum=0, left=0;
        int res = Integer.MIN_VALUE;
        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            while(left <= right && sum > target){
                sum -= nums[left];
                left++;
            }

            if(sum == target){
                res = Math.max(res, right-left+1);
            }
        }

        return res==Integer.MIN_VALUE? -1:(nums.length-res);
    }
}