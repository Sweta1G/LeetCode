class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=1;
        }
        
        
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j])
                    if(arr[j]+1>arr[i])
                        arr[i]= arr[j]+1;
            }
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}