class Solution {
    boolean isPalin(String s){
        StringBuilder sb= new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public String firstPalindrome(String[] words) {
        String s= "";
        for(int i=0;i<words.length;i++){
            if(isPalin(words[i])) return words[i];
        }
        return s;
        
    }
}