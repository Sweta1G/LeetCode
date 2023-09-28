class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr= new int[nums.length];
        if(nums.length==0 || nums.length==1) return nums;
        
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}