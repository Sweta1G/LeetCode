class Solution {
    private String solve(List<String> dict, String str){
        String res[]= new String[101]; int min= Integer.MAX_VALUE;
        Arrays.fill(res,"");
        
        for(String s: dict){
            int n= s.length();
            if(n>str.length()) continue;
            String sub= str.substring(0,n);
            if(s.equals(sub) && min>n){
                res[sub.length()]= s;
                min= n;
            }
        }
        for(String s: res)
            if(s.length()!=0) return s;
        return "";
    }
    public String replaceWords(List<String> dict, String str) {
        String strs[]= str.split(" ");
    
        for(int i=0; i<strs.length; i++){
            String prefix= solve(dict,strs[i]);
            if(prefix.length()==0) continue;
            strs[i]= prefix;
        }
        return String.join(" ", strs);
    }
}