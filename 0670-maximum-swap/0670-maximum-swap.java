class Solution {
    public int maximumSwap(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        int n= nums.length;
        int maxIdx= n-1;
        int left= -1, right=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]>nums[maxIdx])
                maxIdx= i;
            else if(nums[i]<nums[maxIdx]){
                left= i;
                right= maxIdx;
            }
        }
        if(left==-1) return num;
        char t= nums[left];
        nums[left]= nums[right];
        nums[right]= t;
        
        return Integer.parseInt(new String(nums));
    }
}
// 72376
// 77326