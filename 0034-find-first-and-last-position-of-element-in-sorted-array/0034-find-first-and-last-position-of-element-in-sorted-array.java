class Solution {
    private int bSearch(int arr[], int n, int t, char c){
        int low= 0, high= n-1, res= -1;
        if(c=='s'){
            while(low<=high){
                int m= low + (high-low)/2;
            
                if(arr[m]==t){res= m; high= m-1;}
                else if(arr[m]<t) low= m+1;
                else high= m-1;
            }
        }
        else{
            while(low<=high){
                int m= low + (high-low)/2;
            
                if(arr[m]==t){res= m; low= m+1;}
                else if(arr[m]<t) low= m+1;
                else high= m-1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        if(n==0) return new int[]{-1,-1};
        
        int s= bSearch(nums,n,target,'s');
        int e= bSearch(nums,n,target,'e');
        if(s==-1 || e==-1) return new int[]{-1,-1};
        
        return new int[]{s,e};
    }
}