class Solution {
    // 5 5 5 5 20 20
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        int n= bills.length;
        if(bills[0]!=5) return false;
        for(int i=0; i<n; i++){
            if(mp.containsKey(bills[i]))
                mp.put(bills[i], mp.get(bills[i])+1);
            else mp.put(bills[i],1);
            
            if(bills[i]==10){
                if(!mp.containsKey(5) || mp.get(5)==0) return false;
                else mp.put(5,mp.get(5)-1);
                
            }else if(bills[i]==20){
                if(mp.containsKey(5) && (mp.get(5)>=3 || (mp.get(5)>=1 && mp.containsKey(10) && mp.get(10)>=1)))
                   {
                    if(mp.containsKey(5) && mp.containsKey(10) && mp.get(5)>=1 && mp.get(10)>=1){
                        mp.put(5,mp.get(5)-1);
                        mp.put(10,mp.get(10)-1);
                    }else
                        mp.put(5,mp.get(5)-3);
                }else return false;
            }
            
        }
        return true;
    }
}