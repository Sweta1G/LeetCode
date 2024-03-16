class Solution {
    public int findMaxLength(int[] nums) {
        int n= nums.length;
        if(n==1) return 0;
        else if(n==2){
            if((nums[0]==0 && nums[1]==1) || (nums[0]==1 && nums[1]==0))
                return 2;
            else return 0;
        }
        
        int count=0, max=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<n;i++){
            // map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(nums[i]==0) count+=-1;
            else count+=1;
            
            if(map.containsKey(count))
                max= Math.max(max,i-map.get(count));
            else
                map.put(count,i);
        }
        return max;
    }
}