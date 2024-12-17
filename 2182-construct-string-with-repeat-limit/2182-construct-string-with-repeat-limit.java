class Solution {
    private int nextMax(int freq[], int x){
        for(int i= x-1; i>=0; i--)
            if(freq[i]>0) return i;
        return -1;
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb= new StringBuilder();
        int n= s.length(), max= 0, t= 0;
        int freq[]= new int[26];
        
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']++;
            max= Math.max(s.charAt(i)-'a',max);
        }
        
        while(max>=0){
            t++;
            sb.append((char) (max+'a'));
            freq[max]--;
            if(freq[max]==0){
                t=0;
                max= nextMax(freq,max);
                continue;
            }
            if(t==repeatLimit){
                int low= nextMax(freq,max);
                if(low<0) return sb.toString();
                sb.append((char) (low+'a'));
                freq[low]--;
                t=0;
            }
                
        }
        return sb.toString();
    }
}