class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[0];
//         if(nums[0]!=nums[1]) return nums[0];
//         if(nums[n-1]!=nums[n-2]) return nums[n-1];
        
        int low= 0, high= n-1;
        while(low<=high){
            int m= low + (high-low)/2;
            int l= (m+n-1)%n , r= (m+1)%n;
            if(nums[m]!=nums[l] && nums[m]!=nums[r])
                return nums[m];
            else if ((m%2==1 && nums[m]== nums[l]) || (m%2==0 && nums[m]== nums[r]))
                low = m+1;
            else
                high = m-1;
        }
        return -1;
    }
}