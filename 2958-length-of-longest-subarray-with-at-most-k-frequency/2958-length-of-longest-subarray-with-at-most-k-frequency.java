class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res= 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0, j=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            while(map.get(nums[i])>k){
                map.put(nums[j], map.get(nums[j])-1);
                j++;
            }
            res= Math.max(res,i-j+1);
        }
        return res;
//         int ans = 0;
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         int l = 0;

//         for (int r = 0; r < nums.length; r++) {
//             mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
//             while (mp.get(nums[r]) > k) {
//                 mp.put(nums[l], mp.get(nums[l]) - 1);
//                 l++;
//             }
//             ans = Math.max(ans, r - l + 1);
//         }

//         return ans;
    }
}