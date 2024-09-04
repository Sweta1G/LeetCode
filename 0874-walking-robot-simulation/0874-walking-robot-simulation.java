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
//     public int robotSim(int[] commands, int[][] obstacles) {   
//         int dir = 0; // states 0north-1east-2south-3west
//         int farthestSofar = 0;
        
//         int xloc = 0;
//         int yloc = 0;
        
//         Set<String> set = new HashSet<>();
//         for (int[] obs : obstacles) {
//             set.add(obs[0] + "," + obs[1]);
//         }
        
//         int steps; 
        
//         for(int i: commands){
            
//             if( i == -1){//turn right 90
//                 dir++;
//             }
//             else if (i == -2){//turn left 90
//                 dir--;
//             }
//             else{//move forward value of i baring no obsticals
//                 dir = dir%4;
//                 if (dir== -1){
//                     dir = 3;
//                 }
//                 else if(dir == -3){
//                     dir = 1;
//                 }
//                 else if(dir == -2){
//                     dir = 2;
//                 }
//                 // dir %4 = -1 -> 3
//                 // dir %4 = -2 -> 2
//                 // dir %4 = -3 -> 1
//                 if(dir == 0){
//                     steps = 0;
//                     while (steps < i && !set.contains((xloc) + "," + (yloc+1))) {
//                     yloc++;
//                     steps++;
//                     }
//                 }
//                 else if (dir == 1){
//                     steps = 0;
//                     while (steps < i && !set.contains((xloc+1) + "," + (yloc))) {
//                     xloc++;
//                     steps++;
//                     }
//                 }
//                 else if (dir == 2){
//                     steps = 0;
//                     while (steps < i && !set.contains((xloc) + "," + (yloc-1))) {
//                     yloc--;
//                     steps++;
//                     }
//                 }
//                 else{ //case dir == 3
//                     steps = 0;
//                     while (steps < i && !set.contains((xloc-1) + "," + (yloc))) {
//                     xloc--;
//                     steps++;
//                     }
//                 }
//             }
//             farthestSofar = Math.max(farthestSofar, xloc*xloc + yloc*yloc);
//         }
//         return farthestSofar;
//     }
}