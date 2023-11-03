class Solution {
    public List<String> buildArray(int[] t, int n) {
        List<String> ans= new ArrayList();
        if(t.length==1){
            int i=1;
            while(i != t[0]){
                ans.add("Push");
                ans.add("Pop");
                i++;
            }
            ans.add("Push");
            return ans;
        }
        int num=1, i=0;
        do{
            ans.add("Push");
            if(num != t[i]) {
                ans.add("Pop");
                num++;
            }
            else{
                i++; num++;
            }
            
        }while(num<=n && i<t.length);

        return ans;
    }
}