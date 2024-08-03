class Solution {
    private boolean equalElements(int[] t, int[] arr, int n){
        Arrays.sort(t);
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
            if(arr[i]!=t[i]) return false;
        return true;
    }
    public boolean canBeEqual(int[] target, int[] arr) {
        int n= arr.length;
        // if(n==1 && arr[0]==target[0]) return true;
        if(!equalElements(target,arr,n)) return false;
        return true;
        
        
        
        
        
        
    }
}