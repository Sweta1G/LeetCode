class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();
        char ana[]= p.toCharArray();
        Arrays.sort(ana);
        
        int i=0, j=0, k= p.length();
        while(j<s.length()){
            if(j-i+1==k){
                char tmp[]= s.substring(i,j+1).toCharArray();
                Arrays.sort(tmp);
                if(Arrays.equals(tmp,ana)) res.add(i);
                i++;
            }
            j++;
        }
        return res;
    }
}