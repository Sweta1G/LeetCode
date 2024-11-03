class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        
        StringBuilder sb= new StringBuilder(s);
        sb.append(s);
        for(int i=0; i<s.length(); i++){
            if(sb.substring(i,i+s.length()).equals(goal)) return true;
        }
        return false;
    }
}