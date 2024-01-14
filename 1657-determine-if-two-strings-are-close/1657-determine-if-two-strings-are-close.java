class Solution {
    private HashMap<Character,Integer> freq(String word){
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0; i<word.length(); i++){
            if(map.containsKey(word.charAt(i)))
                map.put(word.charAt(i), map.get(word.charAt(i))+1);
            else
                map.put(word.charAt(i),1);
        }
        return map;
    }
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        
        // HashMap<Character,Integer> map1= freq(word1);
        // HashMap<Character,Integer> map2= freq(word2);
        
        int freq1[]= new int[26];
        int freq2[]= new int[26];
        for(char ch: word1.toCharArray())
            freq1[ch-'a']++;
        
        for(char ch: word2.toCharArray())
            freq2[ch-'a']++;
        
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }
        
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}