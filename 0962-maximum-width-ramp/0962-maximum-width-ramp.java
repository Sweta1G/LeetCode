class Solution {
    public int maxWidthRamp(int[] nums) {
        int n= nums.length, res= 0;
        Stack<Integer> s= new Stack<>();
        
        for(int i=0; i<n; i++)
            if(s.size() == 0 || nums[s.peek()] > nums[i] )
                s.push(i);
        
        for(int j= n-1; j>=0; j--)
            while(s.size()>0 && nums[s.peek()] <= nums[j])
                res= Math.max(res,j-s.pop());
        
        
        return res;
    }
}