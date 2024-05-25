class Solution {
    private String concatt(String[] word){
        StringBuilder sb= new StringBuilder();
        for(String s:word)
            sb.append(s);
        return sb.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1= concatt(word1);
        String s2= concatt(word2);
        return s1.equals(s2);
    }
}