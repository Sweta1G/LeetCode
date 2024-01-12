class Solution {
    boolean isVowel(char c){
        // if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u') || c.equals('A') || c.equals('E') || c.equals('I') || c.equals('O') || c.equals('U')) return true;
        
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') return true;
        
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int idx= s.length()/2;
        int count=0, cnt=0;
        for(int i=0; i<idx; i++){
            if(isVowel(s.charAt(i))) count++;
        }
        for(int i= idx; i<s.length(); i++){
            if(isVowel(s.charAt(i))) cnt++;
        }
        return count==cnt;
    }
}