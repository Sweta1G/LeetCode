class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        // return Collections.max(map.values());
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}