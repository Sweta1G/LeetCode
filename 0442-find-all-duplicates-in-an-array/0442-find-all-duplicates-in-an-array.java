class Solution {
    // 1 2 2 3 3 4 7 8
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]) list.add(nums[i]);
        }
        return list;
    }
}