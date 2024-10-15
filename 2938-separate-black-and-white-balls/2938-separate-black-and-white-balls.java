class Solution {
    public long minimumSteps(String s) {
        long res= 0, zero= 0;
        for(int i= s.length()-1; i>=0; i--){
            char c= s.charAt(i);
            if(c=='0') zero++;
            else{
                res+= zero;
                // zero= 0;
            }
        }
        return res;
    }
}