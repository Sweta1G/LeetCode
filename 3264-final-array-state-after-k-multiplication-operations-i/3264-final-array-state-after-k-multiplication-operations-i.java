class Solution {
    private int find(int[] arr, int n){
        int min= Integer.MAX_VALUE;
        for(int i : arr)
            if(min>i) min= i;
        for(int i=0; i<n; i++)
            if(arr[i]==min) return i;
        return -1;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        while(k-->0){
            int minIndex= find(nums,nums.length);
            nums[minIndex]*= multiplier;
        }
        
        return nums;
    }
}