class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums, target, true);
        int end=binarySearch(nums, target, false);
        return new int[]{start, end};
    }
    private int binarySearch(int[] nums, int target, boolean isStart){
        int left = 0, right= nums.length-1;
        int result = -1;
        while(left <= right){
            int pivot = left + (right-left)/2;
            if (nums[pivot]< target)
                left = pivot+1;
            else if (nums[pivot]> target)
                right = pivot -1;
            else{
                result = pivot;
                if (isStart){
                    right = pivot -1;
                }else{
                    left = pivot +1;
                }
            }
        }
        return result;
    }
}