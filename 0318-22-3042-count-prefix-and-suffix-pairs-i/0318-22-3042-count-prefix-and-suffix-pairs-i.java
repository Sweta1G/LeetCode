class Solution {
    private boolean f(String s1, String s2){
        int n= s1.length(), m= s2.length();
        if(n>m) return false;
        return s1.equals(s2.substring(0,n)) && s1.equals(s2.substring(m-n))? true:false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n= words.length, count= 0;
        for(int i=0; i<n-1; i++)
            for(int j=i+1; j<n; j++)
                if(f(words[i],words[j])) count++;
        return count;
    }
}