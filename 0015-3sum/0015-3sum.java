class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j= i+1;
            int k= n-1;
            while(j<k){
                int total= nums[i] + nums[j] + nums[k];
                if(total > 0) k--;
                else if(total < 0) j++;
                else{
                    List<Integer> tmp= new ArrayList<>();
                    tmp.add(nums[i]); tmp.add(nums[j]); tmp.add(nums[k]);
                    res.add(tmp);
                    j++;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        
        return res;
        
    
              
    }
}