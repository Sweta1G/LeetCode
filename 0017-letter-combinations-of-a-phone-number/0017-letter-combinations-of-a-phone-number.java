class Solution {
    private String help(char x){
        switch(x){
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
        }
        return "";
    }
    private void solve(String ip, int i, StringBuilder op, List<String> res){
        if(i>=ip.length()){
            res.add(op.toString());
            return;
        }
        
        char x= ip.charAt(i);
        String value= help(x);
        for(char c : value.toCharArray()){
            op.append(c);
            solve(ip,i+1,op,res);
            op.deleteCharAt(op.length()-1);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        int n= digits.length();
        List<String> res= new ArrayList<>();
        if(n==0) return res;
        solve(digits,0,new StringBuilder(),res);
        
        return res;
    }
}