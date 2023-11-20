class Solution {
    public int garbageType(String X, String garbage[], int travel[]){
        int t=0;
        for(int i=0; i<garbage.length; i++){
            
            for(int j=0; j<travel.length; j++){
                int len=0;
                if(garbage[i].contains(X)){
                    t+=travel[j];
                    while(len<garbage[i].length()){
                        if(garbage[i].substring(len, len+1).equals(X))
                            t++;
                        len++;
                    }
                }
            }
        }
        return t;
    }
    public int garbageCollection(String[] garbage, int[] travel) {
        // int metal_t= garbageType("M", garbage, travel);
        // int paper_t= garbageType("P", garbage, travel);
        // int glass_t= garbageType("G", garbage, travel);
        // return metal_t+paper_t+glass_t;
        
        int res = 0;

        for (String g : garbage) {
            res += g.length();
        }

        boolean m = false, p = false, g = false;

        for (int i = travel.length; i > 0; i--) {
            m = m || garbage[i].contains("M");
            p = p || garbage[i].contains("P");
            g = g || garbage[i].contains("G");

            res += travel[i-1] * ((m ? 1 : 0) + (p ? 1 : 0) + (g ? 1 : 0));
        }

        return res;    
    }
}