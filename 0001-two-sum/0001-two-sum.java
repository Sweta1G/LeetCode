class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int idx[]= new int[2];
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j]==target){
//                     idx[0]=i; idx[1]=j;
//                 }
            
//             }
//         }
//         return idx;
        int idx[]= new int[2];
        for(int i=0; i<nums.length; i++){
            int find= target- nums[i];
            int x= search(nums, i+1, find);
            if(x!= -1){
                idx[0]= i;
                idx[1]= x;
            }
        }
        return idx;
    }
    private int search(int nums[], int start, int target){
        
        for(int i= start; i<nums.length; i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}