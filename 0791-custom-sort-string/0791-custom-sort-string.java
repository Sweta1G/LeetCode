class Solution {
    public String customSortString(String order, String s) {
        if(order.length()==1) return s;
        
        Map<Character,Integer> map= new HashMap<>();
        StringBuilder sb= new StringBuilder();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(char c: order.toCharArray()){
            if(map.containsKey(c)){
                sb.append(String.valueOf(c).repeat(Math.max(0,map.get(c))));
                map.remove(c);
            }
        }
        
        for(char c: map.keySet()){
            sb.append(String.valueOf(c).repeat(Math.max(0,map.get(c))));
        }
        return sb.toString();
    }
}