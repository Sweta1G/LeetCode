class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n= nums.length, i=0, j=0;
        Set<Integer> set= new HashSet<>();
        
        long res= 0, sum= 0;
        while(j<n){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum+= nums[j];
                if(j-i+1==k){
                    res= Math.max(sum,res);
                    set.remove(nums[i]);
                    sum-=nums[i];
                    i++;
                }
            }
            else{
                
                while(i<n && nums[i]!=nums[j]){
                    set.remove(nums[i]);
                    sum-=nums[i];
                    i++;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}