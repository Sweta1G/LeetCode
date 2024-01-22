class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans= new int[2];
        Set<Integer> set= new HashSet<>();
        
        for(int i: nums){
            set.add(i);
        }
        
        for(int i=1; i< nums.length; i++){
            if(nums[i-1]==nums[i]){
                ans[0]=nums[i];
                break;
            }
        }
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)) {
                ans[1]= i;
                break;
            }
        }
        return ans;
    }
}