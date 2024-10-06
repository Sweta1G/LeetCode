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
        // for(int z= 0; z<value.length(); z++){
        //     solve(ip,i+1,op+value.substring(z,z+1),res);
        //     if(op.length()>0)
        //         op= op.substring(0,op.length()-1);
        // }
        for(char c : value.toCharArray()){
            op.append(c);
            solve(ip,i+1,op,res);
            op.deleteCharAt(op.length()-1);
        }
        
        
//         if (idx == digits.length()) {
//             res.add(comb.toString());
//             return;
//         }
        
//         String letters = digitToLetters.get(digits.charAt(idx));
//         for (char letter : letters.toCharArray()) {
//             comb.append(letter);
//             backtrack(digits, idx + 1, comb, res, digitToLetters);
//             comb.deleteCharAt(comb.length() - 1);
//         }
    }
    public List<String> letterCombinations(String digits) {
        int n= digits.length();
        List<String> res= new ArrayList<>();
        if(n==0) return res;
        solve(digits,0,new StringBuilder(),res);
        
        return res;
    }
}