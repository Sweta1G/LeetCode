class Solution {
    public int minSwaps(String s) {
        int n= s.length();
        if(n==0 || n==2){ 
            if(s.charAt(0)==']') 
                return 1;
            return 0;
        }
        int open =0;
        for(char c : s.toCharArray()){
            if(c=='[') open++;
            else{
                if(open>0) open--;
                
            }
        }
        return (open+1)/2;
    }
}