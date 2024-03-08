class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i]))
        //         map.put(nums[i],map.get(nums[i]+1));
        //     else
        //         map.put(nums[i],1);
        // }
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> arr= new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            arr.add(e.getValue());
        }
    
        Collections.sort(arr); 
        int t=0;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==arr.get(arr.size()-1)) t++;
        }
        return arr.get(arr.size()-1)*t;
    }
}