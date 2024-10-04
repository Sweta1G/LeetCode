class Solution {
    public long dividePlayers(int[] skill) {
        int n= skill.length;
        if(n==2) return (long) skill[0]*skill[1];
        int[] freq= new int[1001];
        
        int teams= n/2;
        int total= 0;
        for(int i:skill){
            total+=i;
            freq[i]++;
        }
        if(total % (n/2)!=0) return -1;
        int req= total/teams;
        
        // Arrays.sort(skill);
        long res= 0;
        for(int s : skill){
            int tmp= req- s;
            if(freq[tmp]==0) return -1;
            res+= (long) s* (long) tmp;
            freq[tmp]--;
        }
        
        return res/2;
    }
}