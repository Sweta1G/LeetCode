class Solution {
    private StringBuilder invert(StringBuilder s){
        for(int i=0; i<s.length(); i++)
            s.setCharAt(i, s.charAt(i)=='0'? '1' : '0');
        return s;
    }
    
    public char findKthBit(int n, int k) {
        
        List<StringBuilder> res= new ArrayList<>();
        StringBuilder str= new StringBuilder();
        str.append("0"); res.add(str);
        
        for(int i=1; i<n; i++){
            StringBuilder s= new StringBuilder();
            StringBuilder s1= new StringBuilder();
            StringBuilder s2= new StringBuilder();
            StringBuilder s3= new StringBuilder();

            s1.append(res.get(i-1));
            s2.append(s1);
            s3.append(invert(s2).reverse());

            s.append(s1);
            s.append("1");
            s.append(s3);
            res.add(s);
            
        }
        System.out.println(res.get(n-1));
        return res.get(n-1).charAt(k-1);
    }
}