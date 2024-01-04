import java.util.*;
class Solution {
    public int minOperations(int[] arr) {
           
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==1) return -1;
            count+=e.getValue()/3;
            if(e.getValue()%3!=0) count++;
        }
        return count;
    }
}