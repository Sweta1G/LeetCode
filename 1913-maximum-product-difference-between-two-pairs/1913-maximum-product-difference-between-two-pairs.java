class Solution {
    private int findMax(int nums[]){
        int l=0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]>nums[l]) 
                l=i;
        nums[l]=-1;
        return l;
    }
    // private int findMin(int nums[]){
    //     int l=0;
    //     for(int i=0; i<nums.length; i++)
    //         if(nums[i]>nums[l]) 
    //             l=i;
    //     nums[l]=-1;
    //     return l;
    // }
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
    }
}