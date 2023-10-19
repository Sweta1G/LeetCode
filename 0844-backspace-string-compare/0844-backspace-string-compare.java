class Solution {
    private String check(String str){
        StringBuilder sb= new StringBuilder();
        
        int j=-1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='#' && sb.isEmpty()) continue;
            
            if(str.charAt(i)=='#'){
                sb.deleteCharAt(j);
                j--;
            }
            else if(Character.isLetter(str.charAt(i))){
                sb.append(str.charAt(i));
                j++;
            }   
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        String ans_s= check(s);
        String ans_t= check(t);
        return (ans_s.equals(ans_t))? true:false;   
    }
}