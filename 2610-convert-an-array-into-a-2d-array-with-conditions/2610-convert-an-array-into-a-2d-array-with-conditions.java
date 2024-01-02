class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        int maxRows= Collections.max(map.values());
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        
        // 1 1 1 2 3 3 4
        
        for(int l=0; l<maxRows; l++){
            List<Integer> row= new ArrayList<Integer>();
            for(Map.Entry<Integer, Integer> e: map.entrySet()){
                if(e.getValue() != 0){
                    row.add(e.getKey());
                    map.put(e.getKey(), e.getValue()-1);
                }
            }
            result.add(row);
        }
        return result;
    }
        
}