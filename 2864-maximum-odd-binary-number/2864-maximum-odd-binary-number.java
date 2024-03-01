class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one= count1(s), index=0;
        int zero= s.length()-one;
        StringBuilder sb= new StringBuilder();
        
        if(one==s.length()){
            while(one>0){
                sb.append('1');
                one--;
            }
            return sb.toString();
        }
        while(one>1){
            sb.append('1');
            one--;
        }
        while(zero>0){
            sb.append('0');
            zero--;
        }
        sb.append('1');
        
        return sb.toString();
    }
    private int count1(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') c++;
        }
        return c;
    }
}