class Solution {
    public static void calcSubset(int a[], List<List<Integer> > res, List<Integer> subset, int index){
        res.add(new ArrayList<>(subset));
        
        for (int i = index; i < a.length; i++) {
            subset.add(a[i]);
            calcSubset(a, res, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static List<List<Integer>> findSubsets(int[] a)
    {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer> > res = new ArrayList<>();

        int index = 0;
        calcSubset(a, res, subset, index);

        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        return findSubsets(nums);
    }
}