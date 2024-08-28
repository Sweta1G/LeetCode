class Solution {
    public int countGoodSubstrings(String s) {
        int n= s.length(),k=3, i=0,j=0,res=0;
        HashMap<Character,Integer> mp= new HashMap<>();
        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1==k){
                if(mp.size()==s.substring(i,j+1).length()) res++;
                
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i))==0)
                    mp.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return res;
    }
}