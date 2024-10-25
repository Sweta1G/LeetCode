class Solution {
    private boolean isSubFolder(String s, String t){
        String s1[]= s.split("/");
        String t1[]= t.split("/");
        
        // if(s1[0]!=t1[0]) return false;
        for(int i=0; i<s1.length; i++){
            if(s1[i].equals(t1[i])) continue;
            else return false;
        }
        return true;
    }
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        int n= folder.length;
        
        List<String> res= new ArrayList<>();
        int t=0;
        res.add(folder[0]);
        
        for(int i=1; i<n; i++){
            if(isSubFolder(res.get(t),folder[i]))
                continue;
            else{
                res.add(folder[i]);
                t++;
            }
        }
        return res;
    }
}