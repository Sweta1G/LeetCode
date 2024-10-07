class Solution {
    public int minLength(String s) {
        int count= 0;
        int j=0, n= s.length();
        StringBuilder str= new StringBuilder();
        
        while(j<n){
            str.append(s.charAt(j));
            if(str.length()>=2){
                int x= str.length()-1;
                if((str.charAt(x-1)=='A' && str.charAt(x)=='B') || (str.charAt(x-1)=='C' && str.charAt(x)=='D')){
                    str.deleteCharAt(str.length()-1);
                    str.deleteCharAt(str.length()-1);
                    count++;
                }
            }
            j++;
        }
        return str.length();
    }
}