class Solution {
    private void solve(int[] nums,int index, List<Integer> tmp, List<List<Integer>> res){
        // if(index>=nums.length){res.add(tmp);}
        if (index == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[index]);
        solve(nums, index + 1, tmp, res);

        tmp.remove(tmp.size() - 1);
        solve(nums, index + 1, tmp, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> tmp= new ArrayList<>();
        
        solve(nums,0,tmp,res);
        return res;
    }
}