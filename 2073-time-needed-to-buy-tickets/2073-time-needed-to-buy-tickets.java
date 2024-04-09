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
        //      .
        //2 4 3 3 2 4 5- 6
        //1 3 2 2 1 3 4- 6
        //0 2 1 1 0 2 3- 4
        //0 1 0 0      -
        
        //2+3+3+3+2+2+2-->
    }
}