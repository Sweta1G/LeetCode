class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x=0, y=0;
        if(nums2.length%2!=0)
            for(int i:nums1)
                x^=i;
        if(nums1.length%2!=0)
            for(int i:nums2)
                y^=i;
        
        return x^y;
    }
}