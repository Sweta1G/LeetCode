class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res= new StringBuilder();
        int i= 0;
        for(int t : spaces){
            res.append(s.substring(i,t)).append(" ");
            i=t;
        }
        res.append(s.substring(i,s.length()));
        return res.toString();
    }
}