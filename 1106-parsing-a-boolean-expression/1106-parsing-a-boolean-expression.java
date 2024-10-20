class Solution {
    private static char parse_or(String s){
        if(s.length()==1) return s.charAt(0)=='t'? 't':'f';
        boolean res= false;
        for(int i=0; i<s.length(); i++){
            char c1= s.charAt(i);
            if(c1=='t') res= res || true;
            else if(c1=='f') res= res || false;
        }
        return res? 't':'f';
    }
    private static char parse_and(String s){
        if(s.length()==1) return s.charAt(0)=='t'? 't':'f';
        boolean res= true;
        for(int i=0; i<s.length(); i++){
            char c1= s.charAt(i);
            if(c1=='t') res= res && true;
            else if(c1=='f') res= res && false;
        }
        return res? 't':'f';
    }
    private static char parse_not(String s){
        if(s.length()==1) return s.charAt(0)=='t'? 'f':'t';
        return s.charAt(0)=='t'? 'f' : 't';
    }
    
    
    public static boolean parseBoolExpr(String exp) {
        // int n= exp.length();
        Stack<Character> st= new Stack<>();
        for(char c: exp.toCharArray()){
            if(c==')'){
                StringBuilder e = new StringBuilder();
                while(st.size()>1 && st.peek()!='(') 
                    e.append(st.pop());
                st.pop();
                // e= e.reverse();
                char operation= st.pop();
                System.out.println("Expression : "+e+"\tOperation: "+operation);
                char evaluated= '#'; 
                switch(operation){
                    case '&': evaluated= parse_and(e.toString()); break;
                    case '|': evaluated= parse_or(e.toString()); break;
                    case '!': evaluated= parse_not(e.toString()); break;
                }
                System.out.println("Evaluated: "+evaluated);
                st.push(evaluated);
            }
            else st.push(c);
        }
        // return st.peek();
        return st.peek()=='t'? true:false;
    }
}