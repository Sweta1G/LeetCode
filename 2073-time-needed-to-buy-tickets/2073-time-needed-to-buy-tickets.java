class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int n= t.length, seconds=0, x= t[k];

        for(int i=0; i<n; i++){
            if(i<=k){
                if(t[i]<=x) seconds+= t[i];
                else seconds+=x;
                
            }else{
                if(t[i]<x) seconds+=t[i];
                else seconds+= x-1;
                // else
            }
            
        }
        return seconds;
    }
}