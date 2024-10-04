class Solution {
    public long dividePlayers(int[] skill) {
        int n= skill.length;
        if(n==2) return (long) skill[0]*skill[1];
        int teams= n/2;
        int total= 0;
        for(int i:skill)
            total+=i;
        int req= total/teams;
        
        Arrays.sort(skill);
        int i=0, j= n-1;
        long res=0;
        while(i<n/2 && j>=n/2 && i!=j){
            if(skill[i]+skill[j]!=req) return -1;
            else{
                res+= (skill[i]*skill[j]);   
            }
            i++;j--;
        }
        return res;
    }
}