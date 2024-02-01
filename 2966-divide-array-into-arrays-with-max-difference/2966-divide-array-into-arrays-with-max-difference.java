class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res= new int[0][0];
        // int l=0;
        
//         for(int i=1; i<nums.length-1; i+=3){
//             if(Math.abs(nums[i-1]-nums[i])>k && Math.abs(nums[i]-nums[i+1])>k){
//                 res[l][0]= nums[i-1];
//                 res[l][1]= nums[i];
//                 res[l++][2]= nums[i+1];
//             }
//             else return new int[0][0];
                
//         }
        
        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i % 3 == 0){
                if (nums[i + 2] - nums[i] <= k) {
                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    res = Arrays.copyOf(res, res.length + 1);
                    res[res.length - 1] = triplet;
                } else {
                    return new int[0][0];
                }
            }
        }
        return res;
    }
}