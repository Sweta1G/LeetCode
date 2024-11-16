class Solution {
    private boolean Valid(int nums[], int i, int j, int k){
        for(int x=i; x<j; x++){
            if(nums[x]+1!=nums[x+1]) return false;
        }
        return true;
    }
    public int[] resultsArray(int[] nums, int k) {
        int n= nums.length, i=0, j=0;
        int res[]= new int[n-k+1];
        while(j<n){
            if(j-i+1==k){
                if(Valid(nums,i,j,k))
                    res[i]= nums[j];
                else res[i]= -1;
                i++;
            }
            j++;
        }
        return res;
    }
}