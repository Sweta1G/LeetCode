class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length==1) return pref;
        
        int[] arr= new int[pref.length];
        arr[0]= pref[0];
        
        for(int i=1; i<pref.length; i++){
            arr[i]= pref[i]^pref[i-1];
        }
        // for(int i=1; i<pref.length; i++){
        //     int num=0;
        //     for(int j=0; j<i; j++){
        //         num =pref[j]^pref[j+1];
        //     }
        //     arr[i]= num;
        // }
        return arr;
        
    }
}