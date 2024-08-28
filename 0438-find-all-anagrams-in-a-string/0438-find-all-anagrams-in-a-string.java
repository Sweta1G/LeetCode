class Solution {
//     private boolean isEqual(String key, HashMap<Character,Integer> mp, HashMap<Character,Integer> temp){
//         return mp.equals(temp);

//         if (mp.size() != temp.size())
//             return false;
//         return mp.entrySet().stream().allMatch(e -> e.getValue().equals(temp.get(e.getKey())));
//     }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();
        
        int i=0, j=0, k= p.length();
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int l=0; l< k; l++)
            mp.put(p.charAt(l),mp.getOrDefault(p.charAt(l),0)+1);
        
        HashMap<Character,Integer> temp= new HashMap<>();
        while(j<s.length()){
            temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j), 0)+1);
            if(j-i+1==k){
                if(mp.equals(temp)) res.add(i);
                // if(isEqual(p,mp,temp)) res.add(i);
                temp.put(s.charAt(i),temp.get(s.charAt(i))-1);
                if(temp.get(s.charAt(i))==0) temp.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return res;
    }
}