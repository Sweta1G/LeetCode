class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        String ans = "";
        int i = 0;
       while(i < sentence.length())
        {
            String word = "";
            int j = i;
            int found = -1;
            while((j < sentence.length()) && (sentence.charAt(j) != ' '))
            {
                word += sentence.charAt(j);
                if((found == -1) && (dict.contains(word)))
                {
                    ans += word;
                    ans += " ";
                    found = 1;
                }
                j ++;
            }
            while((j < sentence.length()) && (sentence.charAt(j) == ' '))
            {
                j ++;
            }
            i = j;
            
            if(found == -1)
            {
                ans += word;
                ans += " ";
            }
        }
        return ans.substring(0, ans.length()-1);
    }
    
}