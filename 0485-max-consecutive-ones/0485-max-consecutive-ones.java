class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        List<Integer> list= new ArrayList();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) count++;
            if(nums[i]==0 || i==nums.length-1){
                list.add(count);
                count=0;
            }
        }
        return Collections.max(list);
    }
}