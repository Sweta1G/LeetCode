class Solution {
    private void find(int arr[], int i, List<List<Integer>> res){
        if(i>=arr.length){
            List<Integer> tmp= new ArrayList<>();
            for(int x:arr)
                tmp.add(x);
            res.add(tmp);
            return;
        }
        
        for(int j=i;j<arr.length; j++){
            swap(arr,i,j);
            find(arr,i+1,res);
            
            swap(arr,i,j);
        }
    }
    private void swap(int arr[], int i, int j){
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]= t;
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        if(nums.length==0) return res;
        if(nums.length==1){
            List<Integer> tmp= new ArrayList<>();
            for(int x:nums)
                tmp.add(x);
            res.add(tmp);
            return res;
        }
        
        find(nums,0,res);
        
        return res;
    }
}