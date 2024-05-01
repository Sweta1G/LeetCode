class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb= new StringBuilder();
        
        int k=0;
        for(int i=0; i<word.length(); i++){
            char c= word.charAt(i);
            
            sb.append(c);
            if(c==ch && k==0){
                sb.reverse();
                k++;
            }
        }
        return sb.toString();
    }
}