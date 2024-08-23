class Solution {
    private String complement(String s){
        char c= s.charAt(0)=='-'? '+':'-';
        s= c+s.substring(1);
        return s;
    }
    private int __gcd(int a, int b){  
        return b == 0? a:__gcd(b, a % b);     
    }
    private int LcmOfArray(int[] arr, int idx){
        if (idx == arr.length - 1)
            return arr[idx];
        int a = arr[idx];
        int b = LcmOfArray(arr, idx+1);
        return (a*b/__gcd(a,b)); 
    }
    public String fractionAddition(String expression) {
        String exp[]= expression.split("(?=[+-])");
        int n= exp.length;
        for(int i=0; i<n; i++)
                if(exp[i].charAt(0)=='+') exp[i]= exp[i].substring(1);
        if(n==1) 
            return exp[0];
        
        
        int dino[]= new int[n];
        int nume[]= new int[n];
        
        for(int i=0; i<n; i++){
            String s[]= exp[i].split("/");
            nume[i]= Integer.parseInt(s[0]);
            dino[i]= Integer.parseInt(s[1]);
        }
        int num= 0;
        int lcm= LcmOfArray(dino,0);
        for(int i=0; i<n; i++){
            nume[i]*= (lcm/dino[i]);
            num+= nume[i];
        }
        for(int i=2; i<=lcm; i++){
            while(num%i== 0 && lcm%i== 0){
                num/= i;
                lcm/= i;
            }
        }
        // if(num==0) return String.valueOf(num)+"/1";
        return String.valueOf(num)+"/"+String.valueOf(lcm);
    }
}