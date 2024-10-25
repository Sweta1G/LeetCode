class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        int n= folder.length;
        
        List<String> res= new ArrayList<>();
        res.add(folder[0]);
        
        for(int i=1; i<n; i++){
            String lastFolder = res.get(res.size() - 1) + "/";
            
            if (!folder[i].startsWith(lastFolder)) {
                res.add(folder[i]);
            }
        }
        return res;
    }
}