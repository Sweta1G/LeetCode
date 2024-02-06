class Solution {
    public String getSignature(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                sb.append((char) ('a' + i)).append(count[i]);
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            groups.computeIfAbsent(getSignature(s), k -> new ArrayList<>()).add(s);
        }

        result.addAll(groups.values());

        return result;
    }
//     public HashMap<Character,Integer> freq(String str){
//         HashMap<Character,Integer> map= new HashMap<>();
// //         char[] s= str.toCharArray();
// //         Arrays.sort(s);
        
// //         for(char c: s){
// //             map.put(c,map.getOrDefault(c,1)+1);
// //         }
// //         return map;
//         char[] s= str.toCharArray();
//         Arrays.sort(s);
        
//         for(char c: s){
//             // map.put(c,map.getOrDefault(c,1));
//             if(map.containsKey(c))
//                 map.put(c,map.get(c)+1);
//             else
//                 map.put(c,1);
//         }
//         return map;
//     }
//     public boolean checkMap(HashMap<Character,Integer> map1, HashMap<Character,Integer> map2){
//         if(map1.size()!=map2.size()) return false;
        
//         // for(Map.Entry<Character,Integer> e: map1.entrySet()){
//         //     if(map2.containsKey(e.getKey()) && map2.get(e.getKey())!=e.getValue()){
//         //         return false;
//         //     }
//         // }
//         for (char key : map1.keySet()) {
//             if (!map2.containsKey(key))
//                 return false;
//             if (!map1.get(key).equals(map2.get(key)))
//                 return false;    
//         }
//         // return true;
//         return true;
//     }
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> result= new ArrayList<>();
//         for(int i=0; i<strs.length-1; i++){
//             List<String> ans= new ArrayList<>();
//             for(int j=i+1; j<strs.length; j++){
//                 if(checkMap(freq(strs[i]), freq(strs[j]))){
//                     ans.add(strs[j]);
//                 }
//             }
//             ans.add(strs[i]);
//             result.add(ans);
//         }
//         return result;
//     }
}