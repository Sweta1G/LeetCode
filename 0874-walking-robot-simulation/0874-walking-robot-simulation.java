class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int d= -1;
        int i=0, j=0, n= commands.length;
        HashSet<String> set= new HashSet<>();
        if(obstacles.length>=0){
            for(int[] obs : obstacles)
                set.add(obs[0]+","+obs[1]);
            
        }
        char c= 'n';
        for(int t=0; t<n; t++){
           
            if(commands[t]==-2){
                if(c== 'n') c= 'w';
                else if(c== 'w') c= 's';
                else if(c== 's') c= 'e';
                else c= 'n';
            }
            else if(commands[t]==-1){
                if(c== 'n') c= 'e';
                else if(c== 'e') c= 's';
                else if(c== 's') c= 'w';
                else c= 'n';
            }
            else{
                int z= commands[t];
                while(z-- > 0){
                    if(c=='n') j++;
                    else if(c=='e') i++;
                    else if(c=='s') j--;
                    else i--;
                    if(set.size()>0 && set.contains(i+","+j)){ 
                        
                        if(c=='n') j--;
                        else if(c=='e') i--;
                        else if(c=='s') j++;
                        else i++;
                        break;
                    }
                }
            }
        
            d= Math.max(d,(i*i)+(j*j));
        }
        
        return d;
    }
}