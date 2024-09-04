// class Pair{
//     int x,y;
//     Pair(int x, int y){
//         this.x=x;
//         this.y=y;
//     }
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Pair pair = (Pair) o;
//         return x == pair.x && y == pair.y;
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(x, y);
//     }
// }
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int d= -1;
        int i=0, j=0, n= commands.length;
        HashSet<String> set= new HashSet<>();
        if(obstacles.length>=0){
            for(int[] obs : obstacles)
                set.add(obs[0]+","+obs[1]);
            // for (Pair p : set) 
            //     System.out.println("X: "+p.x+"  Y: "+p.y);
            
        }
        System.out.println("HashSet Size: "+set.size());
        System.out.println("HashSet: ");
        
        
        // commands[]= {4,-1,4,-2,4};
        char c= 'n';
        for(int t=0; t<n; t++){
            // System.out.println("Start of Loop in direction: "+c+" at ("+i+","+j+") with distance: "+d);
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
                        // System.out.println("hdfkjedfb");
                        if(c=='n') j--;
                        else if(c=='e') i--;
                        else if(c=='s') j++;
                        else i++;
                        break;
                    }
                }
            }
            int calc= Math.abs((i*i)+(j*j)); System.out.println("Calculated Distance: "+calc);
            d= Math.max(d,calc);
            System.out.println("Currently in direction: "+c+" at ("+i+","+j+") with distance: "+d);
        }
        
        return d;
    }
}