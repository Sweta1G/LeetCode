class Solution {
    
    public String reverseWords(String s) {
        if( s.length()==1) return s;
        
        StringBuilder resultStr= new StringBuilder();
        String[] words= s.split(" ");
        for(String word: words){
            
            StringBuilder temp= new StringBuilder(word);
            resultStr.append(temp.reverse());
            resultStr.append(" ");
        }
        return resultStr.toString().trim();
    }
}