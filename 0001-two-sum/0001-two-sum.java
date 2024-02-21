class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx[]= new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                 idx[0]=map.get(complement);
                 idx[1]=i;
                 break;
            }
            map.put(nums[i], i);
        }
        return idx;
    }
}