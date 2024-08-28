class Solution {
    public int divisorSubstrings(int num, int k) {
        String s= String.valueOf(num);
        int i=0, j=0, len=s.length(), res= 0;
        
        while(j<len){
            if(j-i+1==k){
                int n= Integer.parseInt(s.substring(i,j+1));
                if(n!=0 && num % n == 0) res++;
                i++;
            }
            j++;
        }
        return res;
    }
}