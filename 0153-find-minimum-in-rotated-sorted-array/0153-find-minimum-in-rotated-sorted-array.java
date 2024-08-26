class Solution {
    public int findMin(int[] arr) {
        int low= 0, n= arr.length, high= n-1;
        if(n==1) return arr[0];
        
        while(low<=high){
            int m= low + (high-low)/2;
            int s= (m+1)%n, e= (m+n-1)%n;
            
            if(arr[m]<arr[s] && arr[m]<arr[e]) return arr[m];
            else if(arr[m]>=arr[high] && arr[m]>=arr[low]) low= m+1;
            else high= m-1;
        }
        return -1;
    }
}