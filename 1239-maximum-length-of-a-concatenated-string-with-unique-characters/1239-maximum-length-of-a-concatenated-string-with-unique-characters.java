class Solution {
    int max=0;
    void dfs(List<String> arr, int index, String s){
        if(unique(s))
            max= Math.max(max, s.length());
        else if(!unique(s) || index==arr.size())
            return;
        for(int i= index; i<arr.size(); i++){
            dfs(arr, i+1, s+arr.get(i));
        }
    }
    boolean unique(String s){
        int cnt[] = new int[26];
        for(char c : s.toCharArray()){
            cnt[c -'a']++;
            if(cnt[c-'a']==2) return false;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        dfs(arr,0,"");
        return max;
    }
}