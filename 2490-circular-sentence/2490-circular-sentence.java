class Solution {
    public boolean isCircularSentence(String sentence) {
        String str[]= sentence.split(" ");
        int n= str.length;
        if(n==1){
            if(str[0].charAt(0)==str[0].charAt(str[0].length()-1)) return true;
            return false;
        }
        if(str[0].charAt(0)!=str[n-1].charAt(str[n-1].length()-1)) return false;
        
        for(int i=0; i<n-1; i++){
            int m= str[i].length();
            if(str[i].charAt(m-1)!=str[i+1].charAt(0)) return false;
        }
        return true;
        
    }
}