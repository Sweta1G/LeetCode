class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans= new int[nums.length];
        Queue<Integer> pos= new LinkedList<>();
        Queue<Integer> neg= new LinkedList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) pos.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0) neg.add(nums[i]);
        }
        
        for(int i=0; i<nums.length; i++){
            if(i%2==0) ans[i]=pos.poll();
            else ans[i]=neg.poll();
        }
        return ans;
    }
}