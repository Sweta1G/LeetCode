class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n= arr.length;
        
        int left= 0, right= n-1;
        for(int i=1; i<n; i++){
            if(arr[i]>=arr[i-1]) left++;
            else break;
        }
        if(left==n-1) return 0;
        // if(left==0) return n-1;
        
        for(int i= right; i>=0; i--){
            if(arr[i]>=arr[i-1]) right--;
            else break;
        }
        int res= Math.min(n-left-1,right);
        for(int i=0, j= right; i<=left && j<n;){
            if(arr[i]<=arr[j]){
                res= Math.min(res,j-i-1);
                i++;
            }
            else j++;
        }
        return res;
    }
}