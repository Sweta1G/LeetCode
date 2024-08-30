class Solution {
    public String minWindow(String s, String t) {
        int n= s.length();
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0; i<t.length();i++)
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        int i=0, j=0, res= Integer.MAX_VALUE, count= mp.size();
        String sb="";
        while(j<n){
            if(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j), mp.get(s.charAt(j))-1);
                if(mp.get(s.charAt(j))==0) count--;
            }
            while(count==0 && i<=j){
                res= Math.min(res,j-i+1);
                if(res==s.substring(i,j+1).length())
                    sb= s.substring(i, j+1);

                if(!mp.containsKey(s.charAt(i))) i++;
                else if(mp.containsKey(s.charAt(i))){
                    mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                    if(mp.get(s.charAt(i))>0) 
                        count++;
                    i++;
                }
            }
            j++;
        }
        return sb;
    }
}