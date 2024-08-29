class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1= nums1.length, n2= nums2.length, n= n1+n2;
        int arr[]= new int[n], x=0;
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j])
                arr[x++]= nums1[i++];
            else 
                arr[x++]= nums2[j++];
        }
        while(i<n1){
            arr[x++]= nums1[i++];
        }
        while(j<n2){
            arr[x++]= nums2[j++];
        }
        double res= arr[n/2]*1.0;
        if(n%2==0){
            res+= arr[(n/2)-1];
            res/=2;
        }
        return res;
    }
}