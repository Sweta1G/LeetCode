class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n!=0) {
            for(int i=0;i<n;i++)
                nums1[i]= nums2[i];
        }
        int i= m-1, j= n-1, x= m+n-1;
        
        while(x>=0 && i>=0 && j>=0){
            if(nums1[i]>nums2[j])
                nums1[x--]= nums1[i--];
            
            else 
                nums1[x--]= nums2[j--];
        }
        while(x>=0 && i>=0){
            // if(nums1[i]>nums2[j])
                nums1[x--]= nums1[i--];
        }
        while(x>=0 && j>=0){
            // if(nums1[i]<nums2[j])
                nums1[x--]= nums2[j--];
        }
    }
}
