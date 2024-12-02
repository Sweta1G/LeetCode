class Solution {
    private boolean find(String s, String t){
        if(s.length()>=t.length() && s.substring(0,t.length()).equals(t)) return true;
        return false;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String str[]= sentence.split(" ");
        for(int i=0; i<str.length; i++){
            if(find(str[i],searchWord)) return i+1;
        }
        return -1;
    }
}