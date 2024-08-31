class Solution {
    private int bSearch(int arr[], int low, int high, int t){
        while(low<=high){
            int m= low+(high-low)/2;
            if(arr[m]==t) return m;
            else if(arr[m]<t) low= m+1;
            else high= m-1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {

        int low=0,n= arr.length, high=n-1, peak= -1;
        // if()
        while(low<=high){
            int m= low+(high-low)/2;
            int l= (m+n-1)%n, r= (m+1)%n;
            if(arr[m]>arr[l] && arr[m]>arr[r]){
                peak= m;
                break;
            }
            else if(arr[low]>arr[m] && arr[m]<arr[high]) high= m-1;
            else low= m+1;
        }
        int x= bSearch(arr,0,peak,target);
        int y= bSearch(arr,peak+1,n-1,target);
        
        if(x==-1 && y==-1) return -1;
        return x==-1? y:x;
    }
}
