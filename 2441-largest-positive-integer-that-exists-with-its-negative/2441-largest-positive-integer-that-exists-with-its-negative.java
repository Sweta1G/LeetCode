class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int max= Integer.MIN_VALUE;
        HashSet<Integer> set= new HashSet<>();
        
        for(int i:nums){
            set.add(i);
            if(set.contains(i*-1)) max= Math.max(max,i);
        }
        
        return max>Integer.MIN_VALUE? max:-1;
    }
}