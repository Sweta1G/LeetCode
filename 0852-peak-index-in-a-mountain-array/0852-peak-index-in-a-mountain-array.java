class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n= arr.length;
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];
        
        int low=0, high= n-1;
        while(low<high){
                    int m= low + (high-low)/2;

            if(arr[m]<arr[m+1]) low= m+1;
            else high= m;
            // m= low + (high-low)/2;
        }
        return low;
    }
}