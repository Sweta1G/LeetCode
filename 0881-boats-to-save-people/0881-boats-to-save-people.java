class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int boats=0, s=0;
        for(int i=people.length-1; i>=s-0; i--){
            if(people[i]==limit) boats++;
            else if(people[i]<limit){
                if(s<people.length && people[s]+people[i]<=limit) {boats++;s++;}
                else boats++;
            }
        }
        return boats;
    }
}