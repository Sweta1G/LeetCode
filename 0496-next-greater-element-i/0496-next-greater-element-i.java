class Solution {
    int binarySearch(int[] num, int t){
        int si=0, ei= num.length-1;
        while(si<=ei)
        {
            int mid= si+(ei-si)/2;
            if(num[mid]==t) return mid;
            else if(num[mid]<t)
                si= mid+1;
            else ei= mid-1;
        }    
        return -1;
    }
    int search(int[] num, int t){
        for(int i=0; i<num.length; i++){
            if(num[i]==t) return i;
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l=0, ans[]= new int[nums1.length];
        // int num[]= new int[nums2.length];
        
        // for(int i=0; i<nums2.length; i++){
        //     num[i]= nums2[i];
        // }
        // Arrays.sort(num);
        
        for(int i=0; i<nums1.length; i++){
            int idx= search(nums2, nums1[i]);
            if(idx==nums2.length-1) {
                ans[l++]=-1;
                continue;
            }
            for(int j= idx+1; j<nums2.length; j++){
                if(nums2[j]>nums1[i]){
                    ans[l++]= nums2[j];
                    break;
                }
                if(j==nums2.length-1) ans[l++]=-1;
            }
        }
        return ans;
    }
}