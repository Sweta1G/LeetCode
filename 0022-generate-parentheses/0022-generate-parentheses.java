class Solution {
    private void helper(int n, int open, int close, List<String> l, String op){
        if(close==0 && open==0 && op.length()== 2*n) {l.add(op); return;}
        if(open>0)
            helper(n,open-1,close,l,op+"(");
        if(close>open)
            helper(n,open,close-1,l,op+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> l= new ArrayList<>();
        helper(n,n,n,l,"");
        return l;
    }
}