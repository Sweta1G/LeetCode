class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.equals(s2)) return true;
        
        String str1[]= s1.split(" ");
        String str2[]= s2.split(" ");
        
        int s1si=0 , s1ei= str1.length -1;
        int s2si=0 , s2ei= str2.length -1;
        
        while(s1si<=s1ei && s1si<= s2ei){
            if(str1[s1si].equals(str2[s2si])){
                s1si++; s2si++;
            }
            else break;
        }
        while(s2ei>=s2si && s1ei>=s1si){
            if(str1[s1ei].equals(str2[s2ei])){
                s1ei--; s2ei--;
            }
            else break;
        }
        // return s1ei < s1si || s2ei < s2si;
        return s1ei < s1si || s2ei < s2si;
    }
}