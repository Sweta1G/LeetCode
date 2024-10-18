
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
//     public void backtrack(int[] nums, int index, int currentOR, int maxOR, int[] count) {
//         if (currentOR == maxOR) {
//             count[0]++;
//         }

//         for (int i = index; i < nums.length; i++) {
//             backtrack(nums, i + 1, currentOR | nums[i], maxOR, count);
//         }
//     }

//     public int countMaxOrSubsets(int[] nums) {
//         int maxOR = 0;

//         // Step 1: Compute the maximum OR
//         for (int num : nums) {
//             maxOR |= num;
//         }

//         int[] count = new int[1];
//         // Step 2: Backtrack to count the subsets
//         backtrack(nums, 0, 0, maxOR, count);

//         return count[0];
//     }
}