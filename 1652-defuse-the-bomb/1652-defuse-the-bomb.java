class Solution {
    public int[] decrypt(int[] code, int k) {
        int n= code.length;
        if(k==0){
            for(int i=0; i<n; i++)
                code[i]= 0;
            return code;
        }
        int sum= 0;
        int[] res= new int[n];
        
        if(k>0){
            
            for(int i=1; i<=k; i++){
                sum+= code[i];  
            }
            res[0]= sum;
            for(int i=1; i<n; i++){
                sum-= code[i];
                sum+= code[(i+k)%n];
                res[i]= sum;
                
            }
        }else{
            k= Math.abs(k);
            int t=k;
            for(int i=n-1;t>0;i--){
                sum+= code[i];
                t--;
            }
            res[0]= sum;
            for(int i=1; i<n; i++){
                sum-= code[(i-k-1+n)%n];
                sum+= code[(i-1+n)%n];
                res[i]= sum;
            }
        }
        return res;
    }
}