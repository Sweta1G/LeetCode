class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n= arr.length;
        int tmp[]= new int[k];
        for(int i : arr){
            int rem= i%k;
            if(rem<0) rem+=k;
            tmp[rem]++;
        }
        if(tmp[0]%2!=0) return false;
        
        for(int i=1; i<=k/2; i++){
            if(tmp[i] != tmp[k - i]) return false;
        }
        return true;
    }
}