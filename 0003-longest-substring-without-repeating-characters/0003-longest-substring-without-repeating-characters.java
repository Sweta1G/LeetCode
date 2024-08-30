class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        
        HashMap<Character,Integer> mp= new HashMap<>();
        // String sb="";
        int i=0, j=0, res= 0;
        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j), 0)+1);
            // if(mp.size()< j-i+1) j++;
            if(mp.size()==j-i+1){
                res= Math.max(res, s.substring(i, j+1).length());
                // sb= s.substring(i, j+1);
                // System.out.println("SB: "+sb);
                // j++;
            }
            else if(mp.size()>j-i+1){
                while(mp.size()>j-i+1){
                    mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
                    if(mp.get(s.charAt(i))==0) mp.remove(s.charAt(i));
                    i++;
                }
            }
            else if(mp.size()<j-i+1){
                while(mp.size()<j-i+1){
                    mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
                    if(mp.get(s.charAt(i))==0) mp.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        
        return res;
    }
}