class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max= nums[0];
        int min= nums[0];
        int res= nums[0];
        
        for(int i=1; i<n; i++){
            int tmp= max;
            max= Math.max(Math.max(max*nums[i], min*nums[i]),nums[i]);
            min= Math.min(Math.min(tmp*nums[i], min*nums[i]),nums[i]);
            
            res= Math.max(max,res);
            
        }
        return res;
        
    }
}